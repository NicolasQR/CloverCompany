package model;

import java.util.*;

public class Seller extends Person {

	ArrayList<Client> clients;
	
	
	
	public Seller(String ID, String name, double cellPhoneNumber, String address) {
		super(ID, name, cellPhoneNumber, address);
		clients = new ArrayList<>();
	}

	public void addClient() {
		// TODO - implement Seller.addClient
		throw new UnsupportedOperationException();
	}

	public void DeleteClient() {
		// TODO - implement Seller.DeleteClient
		throw new UnsupportedOperationException();
	}

	public ArrayList<Client> getClients() {
		// TODO - implement Seller.getClients
		throw new UnsupportedOperationException();
	}

}