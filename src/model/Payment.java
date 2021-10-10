package model;

import java.util.Date;

public class Payment {

	private Date date;
	private double value;

	public Payment() {
		// TODO - implement Payment.Payment
		throw new UnsupportedOperationException();
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	public double getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(double value) {
		this.value = value;
	}

}