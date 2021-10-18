package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class Location {
	private final static int INDEX_DEPARTAMENT = 0;
	private final static int INDEX_MUNICIPALITY = 1;
	private Hashtable<String, ArrayList<String>> location;
	
	public Location() throws IOException {
		location = new Hashtable<String, ArrayList<String>>();
		loadInfo();
	}
	
	private void loadInfo() throws IOException {
		File file = new File("data/Departamentos y municipios.csv");
		@SuppressWarnings("resource")
		BufferedReader bf = new BufferedReader(new FileReader(file));
		
		bf.readLine();
		
		String line;
		String[] info;
		String aux = "";
		String auxLast = "";
		ArrayList<String> municipaly = new ArrayList<>();
		
		line = bf.readLine();
		boolean completed = false;
		while(line != null) {
			info = line.split(",");
			if(aux.equals("")) {
				aux = info[INDEX_DEPARTAMENT];
			} 
			
			if(aux.equals(info[INDEX_DEPARTAMENT])){
				municipaly.add(info[INDEX_MUNICIPALITY]);
				auxLast = aux;
			} else {
				location.put(auxLast, municipaly);
				municipaly = new ArrayList<>();
				
				if (line != "") {
					aux = info[INDEX_DEPARTAMENT];
					municipaly.add(info[INDEX_MUNICIPALITY]);
				}
			}
			if((line = bf.readLine()) == null && !completed) {
				line = "";
				completed = true;
			}
		}
		
	}

	public Hashtable<String, ArrayList<String>> getLocation() {
		return location;
	}

	public void setLocation(Hashtable<String, ArrayList<String>> location) {
		this.location = location;
	}
}
