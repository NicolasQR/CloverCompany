package model;

import java.util.*;

public class Official {

	ArrayList<Seller> sellers;
	private long ID;
	private String name;

	public Official(long ID, String name) {
		this.ID = ID;
		this.name = name;
		sellers = new ArrayList<>();
	}
	
	public long getID() {
		return ID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(long ID) {
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