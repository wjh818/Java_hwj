package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// 한명의 클라이언트와 통신하게 해주는 클래스
public class Client {

	// 소켓이 있어야 클라이언트와 네트워크상에서 소통할 수 있음
	Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		
		receive(); // 반복적으로 클라이언트로부터 메시지 전달 받을 수 있도록 receive 함수 만듦
	}

	// 클라이언트로부터 메시지 전달 받는 함수(메소드)
	public void receive() {
		
		Runnable thread = new Runnable() {

			@Override
			public void run() {
				try {
					// 반복적으로 클라이언트에게 내용 받을 수 있도록 while문 생성
					while(true) {
						// 어떤 내용을 전달 받을 수 있도록 INPUTSTREAM객체 사용
						InputStream in = socket.getInputStream();
						
						byte[] buffer = new byte[512];
						int length = in.read(buffer);
						
						while (length == -1) throw new IOException();
						
						// 서버에 접속한 클라이언트의 주소 정보 출력, 스레드의 이름값 출력
						System.out.println("[메시지 수신 성공]" + socket.getRemoteSocketAddress() + 
																":" + Thread.currentThread().getName() );
					
						String message = new String(buffer, 0, length, "UTF-8");
						
						for(Client client : Main.clients) {
							client.send(message);
						}
					}
					
				} catch(Exception e) {
					try {
						System.out.println("[메시지 수신 오류]" + socket.getRemoteSocketAddress() + 
																":" + Thread.currentThread().getName() );
					} catch(Exception e2) {
						e2.printStackTrace();
					}
				}
				
			}
			
		};
		// 메인함수에 있는 스레드풀에 섭밋을 해줌
		// 즉, 스레드풀에 만들어진 하나의 스레드 등록
		Main.threadPool.submit(thread);
	}

	
	// 클라이언트에게 메시지를 전송하는 메소드
	public void send(String message) {
		
		Runnable thread = new Runnable() {

			@Override
			public void run() {
				try {
					OutputStream out = socket.getOutputStream();
					
					byte[] buffer = message.getBytes("UTF-8");
					// 버퍼에 담긴 내용을 서버에서 클라이언트에게 전송
					out.write(buffer); // ->out.write(int b) : 정수를 인자로 받고 이에 대응하는 바이트를 출력 스트림에 쓴다 
					out.flush();
				} catch (Exception e) {
					try {
						System.out.println("[메시지 송수신 오류]" + socket.getRemoteSocketAddress() +
																" :" + Thread.currentThread().getName());
						Main.clients.remove(Client.this);
						socket.close();
					} catch(Exception e2) {
							e.printStackTrace();
					}
				}
				
				
			}
			
		};
		Main.threadPool.submit(thread);
	}	

}