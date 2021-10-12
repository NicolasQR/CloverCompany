package ui;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuGUI {

	@FXML
    private Button userInfo;

    @FXML
    private Button addClient;

    @FXML
    private Button searchRegion;

    @FXML
    private Button searchId;

    @FXML
    private BorderPane paneContents;

    @FXML
    private BorderPane paneOverview;
    
    @FXML
    private Button showClients;

    @FXML
    private Button showSellers;

    @FXML
    private Button showOfficial;
    
    private ClientsGUI clientsController;
    
    public MenuGUI() {
    	clientsController = new ClientsGUI();
    }
    
    @FXML
    public void loadContents(ActionEvent event) throws IOException {
    	
    	if(event.getSource() == addClient) {
    		
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddClient.fxml"));
    		fxmlLoader.setController(this);

    		Parent root = fxmlLoader.load();
    		
    		paneContents.getChildren().clear();
    		paneContents.setCenter(root);
    		
    		paneContents.setVisible(true);
    		paneOverview.setVisible(false);
    		
    	}
    	if(event.getSource() == searchRegion) {
    		
    	}
    	
    	if(event.getSource() == searchId) {
    		
    	}
    	
    }
    
    @FXML
    public void showClients(ActionEvent event) throws IOException {
    	FXMLLoader open = new FXMLLoader(getClass().getResource("clientsView.fxml"));
    	open.setController(clientsController);
    	Parent root = open.load();
    	
    	paneContents.getChildren().clear();
		paneContents.setCenter(root);
    }

    @FXML
    public void showOfficial(ActionEvent event) {
    	
    }

    @FXML
    public void showSellers(ActionEvent event) {
    	
    }
}
