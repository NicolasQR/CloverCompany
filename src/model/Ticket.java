package model;

import java.util.*;

public class Ticket {

	ArrayList<Payment> payments;
	private double price;
	private double debit;
	private String ID;

	public Ticket(String id, double p, double initialFee) {
		payments = new ArrayList<Payment>();
		ID = id;
		price = p;
		debit = p - initialFee;
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
		if(debit == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param date
	 * @param value
	 */
	public boolean addPayment(Date date, double value) {
		Payment payment = new Payment(date, value);
		if(payments.size() == 0) {
			payments.add(payment);
			return true;
		} else {
			return insertSortPayment(payment);
		}
	}
	
	//Check if it work
	private boolean insertSortPayment(Payment p) {   //Insert payment in date order of lower to higher
		boolean added = false;
		for(int i = 0; i < payments.size(); i++) {
			if(p.getDate().before(payments.get(i).getDate())) {
				payments.set(i, p);
				added = true;
			} else if(p.getDate().equals(payments.get(i).getDate())){
				payments.add(i, p);
			}
		}
		
		return added;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
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
		return ID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(String ID) {
		this.ID = ID;
	}

}