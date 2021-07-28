package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.Lookup;

public class lookupData {
	@SuppressWarnings("resource")
	public static List<Lookup> findAll()  {
		List<Lookup> lookups = new ArrayList<Lookup>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Lookup.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Lookup lookup = new Lookup();
				
				String[] lookupRow = line.split(",");
				
				lookup.setID(Integer.parseInt(lookupRow[0]));
				lookup.setENTITYNAME(lookupRow[1]);
				lookup.setENTITY_STATUS(lookupRow[2]);
				lookup.setDESCRIPTION(lookupRow[3]);
				lookup.setCODE(lookupRow[4]);
				
				lookups.add(lookup);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lookups;
	}

	@SuppressWarnings("resource")
	public static Lookup findOne(int lookup_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Lookup.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Lookup lookup = new Lookup();
				
				String[] lookupRow = line.split(",");
				
				if (Integer.parseInt(lookupRow[0]) == lookup_ID) {
					lookup.setID(Integer.parseInt(lookupRow[0]));
					lookup.setENTITYNAME(lookupRow[1]);
					lookup.setENTITY_STATUS(lookupRow[2]);
					lookup.setDESCRIPTION(lookupRow[3]);
					lookup.setCODE(lookupRow[4]);
					
					return lookup;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static Lookup deleteOne(int lookup_ID)  {
		FileWriter filewriter;

		List<Lookup> lookups = findAll();
		Lookup lookup = findOne(lookup_ID);

		try {
			filewriter = new FileWriter("Lookup.csv");

			for (int i=0; i<lookups.size(); i++) {
				if (lookups.get(i).getID() != lookup_ID) {
					filewriter.append(lookups.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lookup;
	}

	@SuppressWarnings("resource")
	public static List<Lookup> search(String search)  {
		List<Lookup> lookups = new ArrayList<Lookup>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Lookup.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Lookup lookup = new Lookup();
				
				String[] lookupRow = line.split(",");
				
				if (lookupRow[1].contains(search) == true) {
					lookup.setID(Integer.parseInt(lookupRow[0]));
					lookup.setENTITYNAME(lookupRow[1]);
					lookup.setENTITY_STATUS(lookupRow[2]);
					lookup.setDESCRIPTION(lookupRow[3]);
					lookup.setCODE(lookupRow[4]);
					
					lookups.add(lookup);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return lookups;
	}

	public static Lookup Save(Lookup lookup) {
		FileWriter filewriter;

		List<Lookup> lookups = findAll();

		try {
			filewriter = new FileWriter("Lookup.csv");

			for (int i=0; i<lookups.size(); i++) {
				filewriter.append(lookups.get(i).toString());
				filewriter.append("\n");
			}
			if (lookups.size()>0)
				lookup.setID(lookups.get(lookups.size()-1).getID()+1);
			else
				lookup.setID(1);
			filewriter.append(lookup.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lookup;
	}
}
