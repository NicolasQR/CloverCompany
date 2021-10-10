package model;

import java.util.*;

public class Ticket {

	Collection<Payment> payments;
	private double price;
	private boolean paid;
	private double debit;
	private String ID;

	public Ticket() {
		// TODO - implement Ticket.Ticket
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getPaid() {
		return this.paid;
	}

	/**
	 * 
	 * @param paid
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	/**
	 * 
	 * @param date
	 * @param value
	 */
	public void addPayment(Date date, double value) {
		// TODO - implement Ticket.addPayment
		throw new UnsupportedOperationException();
	}

	public ArrayList<Payment> getPayments() {
		// TODO - implement Ticket.getPayments
		throw new UnsupportedOperationException();
	}

	public double getDebit() {
		return this.debit;
	}

	/**
	 * 
	 * @param debit
	 */
	public void setDebit(double debit) {
		this.debit = debit;
	}

	public String getID() {
		// TODO - implement Ticket.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(String ID) {
		// TODO - implement Ticket.setID
		throw new UnsupportedOperationException();
	}

}