package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginGUI {

	
	@FXML
    private AnchorPane paneLogin;
	
	@FXML
    private AnchorPane confirmPassword;
	
	@FXML
    private PasswordField passwordField;
	
	
	MenuGUI menuGUI;
	public LoginGUI() {
	menuGUI = new MenuGUI();	
	}
	
	@FXML
    public void continueLogin(ActionEvent event) throws IOException {
		
		FXMLLoader open = new FXMLLoader(getClass().getResource("Gestion-client.fxml"));
    	open.setController(menuGUI);
    	Parent root = open.load();
    	
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	
    	
    	
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.setScene(scene);
    	stage.setTitle("Gestionar clientes");
    }
	
	@FXML
    public void changePassword(ActionEvent event) throws IOException {
		FXMLLoader open = new FXMLLoader(getClass().getResource("confirmUser.fxml"));
    	open.setController(this);
    	Parent root = open.load();
    	
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.setScene(scene);
    	stage.setResizable(false);
    	stage.setTitle("Confirmar Contraseña");
    	stage.showAndWait();
    }
	
	@FXML
    public void continueToChangePassword(ActionEvent event) throws IOException {

		Node source = (Node) event.getSource();
	    Stage stage = (Stage) source.getScene().getWindow();
	    stage.close();
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("changePassword.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent root = fxmlLoader.load();
		
		paneLogin.getChildren().clear();
		paneLogin.getChildren().setAll(root);
    }
	
	@FXML
    public void createNewPassword(ActionEvent event) throws IOException {
		
		Node source = (Node) event.getSource();
	    Stage a = (Stage) source.getScene().getWindow();
	    a.close();
	    
	    
		FXMLLoader open = new FXMLLoader(getClass().getResource("login.fxml"));
    	open.setController(this);
    	Parent root = open.load();
    	
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.setScene(scene);
    	stage.setResizable(false);
    	stage.setTitle("Confirmar Contraseña");
    	stage.showAndWait();
    }
	
	
}
