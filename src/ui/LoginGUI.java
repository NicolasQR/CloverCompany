package ui;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.CloverCompany;
import model.User;


public class LoginGUI {

	
	
	@FXML
    private AnchorPane paneLogin;
	
	@FXML
    private AnchorPane confirmPassword;
	
	@FXML
    private PasswordField passwordField;
	
	@FXML
    private PasswordField newPassword;

    @FXML
    private PasswordField confirmNewPassword;
    
    @FXML
    private PasswordField confirmPasswordToChange;
	
	private CloverCompany cloverCompany;
	private MenuGUI menuGUI;
	
	public LoginGUI() throws FileNotFoundException, ClassNotFoundException, IOException {
	menuGUI = new MenuGUI();
	cloverCompany = new CloverCompany();
	cloverCompany.loadDataOfUser();
	}
	
	@FXML
    public void continueLogin(ActionEvent event) throws IOException {
		
		String password = passwordField.getText();
		String a = cloverCompany.getUser().getPassword();
		System.out.println("TextField: " + password);
		System.out.println("Contraseña: " + a);
		
		if( password.equals(cloverCompany.getUser().getPassword())) {
			
			Node source = (Node) event.getSource();
		    Stage pane = (Stage) source.getScene().getWindow();
		    pane.close();
			
			
			FXMLLoader open = new FXMLLoader(getClass().getResource("MainPage.fxml"));
	    	open.setController(menuGUI);
	    	Parent root = open.load();
	    	
	    	Scene scene = new Scene(root);
	    	Stage stage = new Stage();
	    	
	    	stage.initModality(Modality.APPLICATION_MODAL);
	    	stage.setScene(scene);
	    	stage.setTitle("Gestionar clientes");
	    	stage.show();
	    	
    	}else {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Warning");
    		alert.setHeaderText(null);
    		alert.setContentText("Contraseña incorrecta");
    		alert.showAndWait();
    	}	
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

		String password = confirmPasswordToChange.getText();
		if(password.equals(cloverCompany.getUser().getPassword())) {
			Node source = (Node) event.getSource();
		    Stage stage = (Stage) source.getScene().getWindow();
		    stage.close();
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("changePassword.fxml"));
			
			fxmlLoader.setController(this);    	
			Parent root = fxmlLoader.load();
			
			paneLogin.getChildren().clear();
			paneLogin.getChildren().setAll(root);
		}else {
			Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Warning");
    		alert.setHeaderText(null);
    		alert.setContentText("Contraseña incorrecta");
    		alert.showAndWait();
		}
    }
	
	
	@FXML
    public void createNewPassword(ActionEvent event) throws IOException {
		
		String newPasswordString = newPassword.getText();
		
		if(newPasswordString.equals(confirmNewPassword.getText())) {
			
			cloverCompany.getUser().setPassword(newPassword.getText());
			cloverCompany.saveDataOfUser();
			
			Node source = (Node) event.getSource();
		    Stage a = (Stage) source.getScene().getWindow();
		    a.close();
		    
		    Alert alert = new Alert(AlertType.INFORMATION);
        	alert.setTitle("Change of password");
        	alert.setHeaderText(null);
        	alert.setContentText("La contraseña se ha actualizado correctamente");
        	alert.showAndWait();
		    
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
	    	
		}else {
			Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Warning");
    		alert.setHeaderText(null);
    		alert.setContentText("Las contraseñas no son iguales");
    		alert.showAndWait();
		}
    }
	
	
}
