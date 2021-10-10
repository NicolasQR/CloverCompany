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
	
	public CloverCompany() {
		user = new User(null);
		user.setPassword("1234");
		System.out.println(user.getPassword());
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
	
	public void addOffitial() {
		// TODO - implement CloverCompany.addOffitial
		throw new UnsupportedOperationException();
	}

	public void addSeller() {
		// TODO - implement CloverCompany.addSeller
		throw new UnsupportedOperationException();
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
}