package model;

public class Person {

	private long ID;
	private String name;
	private double cellPhoneNumber;
	private String address;
	
	public Person(long ID, String name, double cellPhoneNumber, String address) {
		this.ID = ID;
		this.name = name;
		this.cellPhoneNumber = cellPhoneNumber;
		this.address = address;
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
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	/**
	 * 
	 * @param cellPhoneNumber
	 */
	public void setCellPhoneNumber(double cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}