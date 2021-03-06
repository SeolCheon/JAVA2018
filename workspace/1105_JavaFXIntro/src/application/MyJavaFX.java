package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

	@Override //Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		//Create a button and place it in the scene
		Button btOk = new Button("OK");
		Scene scene = new Scene(btOk,200,250);
		primaryStage.setTitle("MyJavaFX");  //Set the stage title
		primaryStage.setScene(scene);		//Place the scene in the stage
		primaryStage.show();				//Display the stage
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
