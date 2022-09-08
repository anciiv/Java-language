package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	private static Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		VBox vBox = new VBox();
		
		Scene scene = new Scene(vBox, 200, 200);
		window.setScene(scene);
		window.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
