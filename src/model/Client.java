package model;

import java.util.*;

public class Client extends Person {
	
	private String associatedSellers;
	private String location;
	ArrayList<Ticket> tickets;
	ArrayList<Seller> sellers;
	

	public Client(long ID, String name, double cellPhoneNumber, String address, String location) {
		super(ID, name, cellPhoneNumber, address);
		tickets = new ArrayList<Ticket>();
		this.location = location;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void sellTicket(Ticket t) {
		tickets.add(t);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Seller> getSellers() {
		return sellers;
	}

	public void setSellers(ArrayList<Seller> sellers) {
		this.sellers = sellers;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	public String getUbication() {
		return location;
	}

	public void setUbication(String ubication) {
		this.location = ubication;
	}

	public String getAssociatedSellers() {
		return associatedSellers;
	}

	public void setAssociatedSellers(String associatedSellers) {
		this.associatedSellers = associatedSellers;
	}

}