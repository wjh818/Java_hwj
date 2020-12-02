package application;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	
	//스레드풀 -> 한정된 자원을 갖고 안정적으로 서버를 운용하기 위해서
	//미리 한번에 만들어 놓고 꺼내서쓰는 형식
	public static ExecutorService threadPool;
	//접속한 클라이언트들 관리할 수 있도록
	public static Vector<Client> clients = new Vector<Client>();
	// 서버 소켓 생성	
	ServerSocket serverSocket;
	
	// 서버를 구동시켜 클라이언트의 연결을 기다리는 메소드
	public void startServer(String IP, int port) {
		try {
			serverSocket = new ServerSocket();
			// 특정 IP번호, port 번호로 특정한 클라이언트에게 접속을 기다리게 해줌
			serverSocket.bind(new InetSocketAddress(IP, port));
		} catch(Exception e) {
			e.printStackTrace();
			if(!serverSocket.isClosed()) { //서버 소켓이 닫혀있는 경우가 아니라면
				stopServer(); //서버 종료
			}
			return;
		}
		// 클라이언트가 접속할 때 까지 계속 기다리는 스레드
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				// 계속해서 새로운 클라이언트가 접속 할 수 있도록
				while(true) {
					try {
						Socket socket = serverSocket.accept();
						clients.add(new Client(socket));
						System.out.println(" [클라이언트 접속] " + socket.getRemoteSocketAddress() +
																	" :" + Thread.currentThread().getName());
					} catch(Exception e) {
						// 서버 소켓에 문제가 생긴거니 서버를 종료시키고 break문을 활용해서 빠져나간다
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		// 스레드풀 초기화
		threadPool = Executors.newCachedThreadPool();
		// 클라이언트에 접속을 원하는 스레드 넣어줌
		threadPool.submit(thread);
	}
	
	// 서버의 작동 중지시켜주는 메소드
	public void stopServer() {
		try {
			// 현재 작업중인 모든 소켓 닫기
			Iterator<Client> iterator = clients.iterator();
			// 한명 한명의 클라이언트에게 접근
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			// 서버 소켓 객체 닫기
			if(serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			//스레드풀 종료
			if(threadPool != null && !threadPool.isShutdown()) {
				threadPool.shutdown();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//UI를 생성하고, 실질적으로 프로그램을 동작시키는 메서드
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		
		root.setPadding(new Insets(5));
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("나눔고딕", 15));
		root.setCenter(textArea);
		
		Button toggleButton = new Button("시작하기");
		toggleButton.setMaxWidth(Double.MAX_VALUE);
		BorderPane.setMargin(toggleButton, new Insets(1, 0, 0, 0));
		root.setBottom(toggleButton);
		
		String IP = "192.168.1.23";
		int port = 9876;
		
		toggleButton.setOnAction(event -> {
			if(toggleButton.getText().equals("시작하기")) {
				startServer(IP, port);
				Platform.runLater(() -> {
					String message = String.format("[서버 시작]\n", IP, port);
					textArea.appendText(message);
					toggleButton.setText("종료하기");
				});
			}else {
				stopServer();
				Platform.runLater(() -> {
					String message = String.format("[서버 종료]\n", IP, port);
					textArea.appendText(message);
					toggleButton.setText("시작하기");
				});
				
			}
		});
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setTitle("[ 채팅 서버 ]");
		primaryStage.setOnCloseRequest(event -> stopServer());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
