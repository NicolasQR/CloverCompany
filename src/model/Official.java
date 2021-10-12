package model;

import java.util.*;

public class Official {

	ArrayList<Seller> sellers;
	private String ID;
	private String name;

	public Official(String ID, String name) {
		this.ID = ID;
		this.name = name;
		sellers = new ArrayList<>();
	}
	
	public String getID() {
		return ID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void addSeller(Seller s) {
		sellers.add(s);
	}
	
	public void removeSeller(Seller s) {
		sellers.remove(s);
	}

	public void DeleteSeller() {
		
	}

	public ArrayList<Seller> getSellers() {
		return sellers;
	}

}