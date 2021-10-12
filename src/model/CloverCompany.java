package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CloverCompany {

	
	public final static String SAVE_PATH_FILE_OF_USERS = "data/users.ap2";
	private String name;
	private User user;
	
	private ArrayList<Client> clients;
	private ArrayList<Seller> sellers;
	private ArrayList<Official> officials;
	
	public CloverCompany() {
		user = new User(null);
		user.setPassword("1234");
		System.out.println(user.getPassword());
		clients = new ArrayList<>();
		sellers = new ArrayList<>();
		officials = new ArrayList<>();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void saveDataOfUser() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE_OF_USERS));
	    oos.writeObject(user);
	    oos.close();
	}
	
	public boolean loadDataOfUser() throws FileNotFoundException, IOException, ClassNotFoundException {
		File f = new File(SAVE_PATH_FILE_OF_USERS);
	    boolean loaded = false;
	    if(f.exists()){
	      ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
	      user = (User) ois.readObject();
	      ois.close();
	      loaded = true;
	    }
	    return loaded;
	}
	
	//rectify
	public boolean addOffitial(String ID, String name) { //Insert ordered with binary search, by ID order
		boolean added = false;
		Official newOfficial = new Official(ID, name);
		if(officials.size() == 0) {
			officials.add(newOfficial);
		} else {
			int i = 0;
			int j = officials.size()-1;
			int m = (i+j)/2;
			
			while(i <= j && added == false) {
				if(newOfficial.getID().compareTo(officials.get(m).getID()) <= 0) {
					officials.add(m, newOfficial);
					j++;
					added = true;
				} else if(i == j) { 
					officials.add(newOfficial);
					j++;
					added = true;
				} else {
					i = m;
					m = (i+j)/2;
				}
				System.out.println("1");
			}
			
		}
		
		return added;
	}

	public void removeOfficial(String ID) {
		
	}
	
	public void addSeller() {
		
	}

	public void addClient() {
		// TODO - implement CloverCompany.addClient
		throw new UnsupportedOperationException();
	}

	public void addTicket() {
		// TODO - implement CloverCompany.addTicket
		throw new UnsupportedOperationException();
	}

	public void addTicketToClient() {
		// TODO - implement CloverCompany.addTicketToClient
		throw new UnsupportedOperationException();
	}

	public void addPaymentToClient() {
		// TODO - implement CloverCompany.addPaymentToClient
		throw new UnsupportedOperationException();
	}

	public void addClientToSeller() {
		// TODO - implement CloverCompany.addClientToSeller
		throw new UnsupportedOperationException();
	}

	public void addSellerToOffitial() {
		// TODO - implement CloverCompany.addSellerToOffitial
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public ArrayList<Seller> getSellers() {
		return sellers;
	}

	public void setSellers(ArrayList<Seller> sellers) {
		this.sellers = sellers;
	}

	public ArrayList<Official> getOfficials() {
		return officials;
	}

	public void setOfficials(ArrayList<Official> officials) {
		this.officials = officials;
	}
	
	
}