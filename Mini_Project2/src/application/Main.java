//package application;
//	
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.geometry.Pos;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Font;
//
//public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		VBox root = new VBox();
//		root.setPrefWidth(350);
//		root.setPrefHeight(150);
//		root.setAlignment(Pos.CENTER);
//		root.setSpacing(20);
//		
//		Label label = new Label();
//		label.setText("Hello, BIT");
//		label.setFont(new Font(50));
//		
//		Button button = new Button();
//		button.setText("확인");
//		button.setOnAction(event->Platform.exit());
//		
//		root.getChildren().add(label);
//		root.getChildren().add(button);
//		
//		Scene scene = new Scene(root);
//		
//		primaryStage.setTitle("AppMain");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//	
//	public static void main(String[] args) {
//		launch(args);
//	}
//}

package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);
		
		TextField textField = new TextField();
		textField. setPrefWidth(200);
		
		Button button = new Button();
		button.setText("확인");
		
		ObservableList list = hbox.getChildren();
		list.add(textField);
		list.add(button);
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
