package ui;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

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
    void loadContents(ActionEvent event) throws IOException {
    	
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
	
}
