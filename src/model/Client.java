package model;

import java.util.*;

public class Client extends Person {

	ArrayList<Ticket> tickets;

	

	public Client(String ID, String name, double cellPhoneNumber, String address) {
		super(ID, name, cellPhoneNumber, address);
		tickets = new ArrayList<Ticket>();
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void sellTicket(Ticket t) {
		tickets.add(t);
	}

}