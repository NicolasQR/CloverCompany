package ui;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
}
