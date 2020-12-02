//package application;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class HWJ extends Application{
//
//	@Override
//	public void start(Stage stage) throws Exception {
//		
////			Pane pane = new Pane();
////			Scene scene = new Scene(pane, 1000, 600);
////			stage.setScene(scene);
////			stage.show();
//			
//			Label label = new Label();
//			label.setText("TEST");
//			label.setStyle("-fx-font-size: 30;");
//			
//			Button button = new Button();
//			button.setText("ok");
//			button.setStyle("-fx-font-size: 30;");
//			button.setOnAction(event -> Platform.exit());
//		
//			StackPane pane = new StackPane();
//			pane.getChildren().addAll(label, button);
//			StackPane.setAlignment(label, Pos.CENTER_LEFT);
//			
//			Scene scene = new Scene(pane, 150, 150);
//			
////			primaryStage.setTitle("회원정보 관리");
////			primaryStage.setScene(scene);
////			primaryStage.show();
//			
////			Button button = new Button();
////			button.setText("ok");
////			button.setOnAction(event->Platform.exit());
//			
//	}
//	
//	public static void main(String[] args) {
//		launch(args);
//	}
//}








package application;

import java.util.Optional;
//import com.sun.media.jfxmedia.logging.Logger;
//import com.sun.javafx.geom.Rectangle;
import com.sun.jdi.event.Event;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;

public class HWJ extends Application {
	
   @Override
   public void start(Stage primaryStage) throws Exception {
	   
      BorderPane box = new BorderPane();
      box.setPadding(new Insets(5));
      
      // 상단 HBox root01
      HBox root01 = new HBox();
      root01.setSpacing(5);
      root01.setPrefWidth(50); //폭 설정
      root01.setPrefHeight(30); //높이 설정
      root01.setSpacing(10); //컨트롤의 간격 설정
      
      // 하단 HBox root
      HBox root = new HBox();
      root.setPrefWidth(150); //폭
      root.setPrefHeight(150); //높이
      root.setSpacing(10); //컨트롤 간격
      TextField userName = new TextField();
      userName.setPrefWidth(150);
      userName.setPromptText("닉네임을 입력하세요.");
      HBox.setHgrow(userName, Priority.ALWAYS);
      TextField IPText = new TextField("192.168.1.9");
      TextField PortText = new TextField("0000");
      PortText.setPrefWidth(80);
      root01.getChildren().addAll(userName, IPText, PortText);
      box.setTop(root01);
      
      // 중간
      TextArea textArea = new TextArea();
      textArea.setPrefWidth(Double.MAX_VALUE);
      textArea.setPrefHeight(20);
      box.setCenter(textArea);
      
      TextField input = new TextField();
      input.setPrefWidth(Double.MAX_VALUE);
      input.setDisable(false);
      
      input.setOnAction(event-> {
          //send(userName.getText() + ": " + input.getText() + "\n");     --send가 오류인데 메소드가 없어서 그런데 서버 연결하면 메소드가 생겨서 된데요!!
          input.setText("");
          input.requestFocus();
      });
      
      // 하단
      root.setAlignment(Pos.BOTTOM_CENTER);
      TextField textfield = new TextField();
      textfield.setPrefWidth(250);
      Button button1 = new Button("전송");
      button1.setDisable(false);
      Button button = new Button("종료");
      button.setDisable(false);
      button.setOnAction(new EventHandler<ActionEvent>() {
    	  
         @Override
         public void handle(ActionEvent e) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("프로그램 종료");
            alert.setHeaderText("잠깐! 서버를 종료하시겠습니까?");
            alert.setContentText("OK 버튼 클릭 시 서버가 종료됩니다.");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
               primaryStage.close();
            } else if (result.get() == ButtonType.CANCEL) {
               e.consume();
            }
         }
      });
      root.getChildren().addAll(textfield, button1, button);
      box.setBottom(root);
      Scene scene = new Scene(box, 1000, 600);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setTitle("사원관리");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String[] args) {
      launch(args);
   }
}