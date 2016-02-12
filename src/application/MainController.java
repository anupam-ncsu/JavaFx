package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class MainController {
	
	@FXML
	private TextField userid;
	
	@FXML
	private TextField password;
	
	@FXML
	private Label Label_1 ;
	
	
	
	public void Login(ActionEvent event ) throws Exception
	{
		//Verify credentials
		if(userid.getText().equals("user")&& password.getText().equals("password"))
		{
			Label_1.setText("Login Successful");
			
			//This part helps to hide this scene once the next scene opens
			((Node)event.getSource()).getScene().getWindow().hide();						
			 //Passing control to the next page
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();			
			Pane root = loader.load(getClass().getResource("/application/ActivitySelection.fxml").openStream());
			UserController userController = (UserController)loader.getController();
			userController.getUser(userid.getText());
			
			Scene s1 = new Scene(root); // The scene inside the stage
			s1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(s1);
			primaryStage.setTitle("Ice River Spring");			
			primaryStage.show(); // Launch the main stage 
		}
		else{
			Label_1.setText("Login credentials incorrect");
		}
	}
	
}
