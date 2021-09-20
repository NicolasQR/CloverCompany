package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class MainPageGUI {

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
    void loadContents(ActionEvent event) {
    	
    	if(event.getSource() == addClient) {
    		
    	}
    	if(event.getSource() == searchRegion) {
    		
    	}
    	
    	if(event.getSource() == searchId) {
    		
    	}
    	
    }

	
}
