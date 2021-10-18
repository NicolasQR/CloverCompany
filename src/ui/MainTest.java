package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import model.CloverCompany;
import model.Official;
import data.Location;

public class MainTest {

	public static void main(String[] args) {
		/*
		CloverCompany clover = new CloverCompany();
		
		clover.addOffitial(1234, "Brayan");
		clover.addOffitial(12345, "Nicolas");
		clover.removeOfficial(1234);
		
		Hashtable<Integer, String> f = new Hashtable<>();
		f.put(1, "Hola");
		
		System.out.println(f.get(1));
		
		if("100639699".compareTo("1006396911") < 0) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
		
		ArrayList<Official> o = clover.getOfficials();
		for(int i = 0; i < o.size(); i++) {
			System.out.println(o.get(i).getName() + " - " + o.get(i).getID());
		}
		*/
		
		try {
			Location l = new Location();
			System.out.println(l.getLocation().get("VALLE DEL CAUCA"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
