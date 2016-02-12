package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UserController implements Initializable {
	
	@FXML
	private Label user1 ;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	//Display USER name at the top of the page
	public void getUser(String user) {
		// TODO Auto-generated method stub
		user1.setText(user); // Getting user name from login page and setting it to the Page2
	}
	
	
	//SignOut button - Takes back to LogIn page
	public void signOut(ActionEvent event) {
		try {
		
			//This part helps to hide this scene once the next scene opens
			((Node)event.getSource()).getScene().getWindow().hide();
			 //Passing control to the next page
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();			
			Pane root;
			root = loader.load(getClass().getResource("/application/LogIn.fxml").openStream());
						
			Scene s1 = new Scene(root); // The scene inside the stage
			s1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(s1);
			primaryStage.setTitle("Java Fx Proof of Concept");			
			primaryStage.show(); // Launch the main stage 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void insertDetail(ActionEvent event) {
		
		try {

			 //Passing control to the next page
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();			
			Pane root;
			root = loader.load(getClass().getResource("/application/insertDetail.fxml").openStream());
						
			Scene s1 = new Scene(root); // The scene inside the stage
			s1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(s1);
			primaryStage.setTitle("Java Fx Proof of Concept");			
			primaryStage.show(); // Launch the main stage 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void updateDetail(ActionEvent event) {
		
		try {

			 //Passing control to the next page
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();			
			Pane root;
			root = loader.load(getClass().getResource("/application/UpdateDetail.fxml").openStream());
						
			Scene s1 = new Scene(root); // The scene inside the stage
			s1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(s1);
			primaryStage.setTitle("Java Fx Proof of Concept");			
			primaryStage.show(); // Launch the main stage 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void generateReport(ActionEvent event) {
		
		try {

			 //Passing control to the next page
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();			
			Pane root;
			root = loader.load(getClass().getResource("/application/GenerateReport.fxml").openStream());
						
			Scene s1 = new Scene(root); // The scene inside the stage
			s1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(s1);
			primaryStage.setTitle("Ice River Spring");			
			primaryStage.show(); // Launch the main stage 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
