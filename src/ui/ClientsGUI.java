package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import data.Location;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Client;

public class ClientsGUI {
	
	@FXML
    private TextField searchTextField;

    @FXML
    private TableView<Client> clientsTableView;

    @FXML
    private TableColumn<Client, String> columName;

    @FXML
    private TableColumn<Client, String> columID;

    @FXML
    private TableColumn<Client, Double> columCellNum;

    @FXML
    private TableColumn<Client, String> columAddress;
    
    @FXML
    private ComboBox<String> boxDepartment;

    @FXML
    private ComboBox<String> boxMunicipality;
    
    private ArrayList<Client> clients;
    
    public ClientsGUI() {
    	
    }

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	public void loadClientInfo() {
		ObservableList<Client> accounts = FXCollections.observableArrayList(clients);
    	
		clientsTableView.setItems(accounts);
		columName.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));
		columID.setCellValueFactory(new PropertyValueFactory<Client, String>("ID"));
		columCellNum.setCellValueFactory(new PropertyValueFactory<Client, Double>("cellPhoneNumber"));
		columAddress.setCellValueFactory(new PropertyValueFactory<Client, String>("address"));
	}
	
	@FXML
    public void addClient(ActionEvent event) throws IOException {
		FXMLLoader open = new FXMLLoader(getClass().getResource("addClient2.fxml"));
    	open.setController(this);
    	Parent root = open.load();
    	
    	Stage stage = new Stage();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.setTitle("Añadir Cliente");
    	stage.setResizable(false);
    	
    	loadLocation(); //load the departments and municipalities in the comboBox
    	
    	stage.showAndWait();
    	
    }
	
	private void loadLocation() { //load departments and municipalities of data csv
		try {
			Location location = new Location();
			ArrayList<String> department = Collections.list(location.getLocation().keys());
			ObservableList<String> dep = FXCollections.observableArrayList(department);
			boxDepartment.setItems(dep);
			
			boxDepartment.setOnAction(e -> loadLocation(boxDepartment.getValue(), location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadLocation(String dep, Location location) {
		ArrayList<String> muni = location.getLocation().get(dep);
		ObservableList<String> municipalities = FXCollections.observableArrayList(muni);
		boxMunicipality.setItems(municipalities);
	}
	
	@FXML
    public void add(ActionEvent event) {
		
	}
}
