package ui;

import java.util.ArrayList;

import model.CloverCompany;
import model.Official;

public class MainTest {

	public static void main(String[] args) {
		CloverCompany clover = new CloverCompany();
		clover.addOffitial("1006396912", "Brayan");
		clover.addOffitial("1006396916", "Nicolás");
		clover.addOffitial("1006396915", "Danilo");
		
		
		ArrayList<Official> o = clover.getOfficials();
		for(int i = 0; i < o.size(); i++) {
			System.out.println(o.get(i).getName() + " - " + o.get(i).getID());
		}
	}

}
