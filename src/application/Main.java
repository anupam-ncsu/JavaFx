package application;
	


import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application   {

	
	
	public static void main(String[] args)  {
		launch(args); // calls JavaFX application constructor to start application
	}	
	
	
	//FIRST LOG IN PAGE LOADING
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		try {	
			Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene s1 = new Scene(root,1300,900); // The scene inside the stage
			s1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(s1);
			primaryStage.setTitle("Ice River Spring");			
			primaryStage.show(); // Launch the main stage
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	
	
}


