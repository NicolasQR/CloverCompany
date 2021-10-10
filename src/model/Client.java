package model;

import java.util.*;

public class Client extends Person {

	ArrayList<Ticket> tickets;

	public Client() {
		tickets = new ArrayList<>();
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void sellTicket(Ticket t) {
		tickets.add(t);
	}

}