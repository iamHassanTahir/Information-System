package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.Campus;

public class campusData {
	@SuppressWarnings("resource")
	public static List<Campus> findAll()  {
		List<Campus> campuses = new ArrayList<Campus>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Campus.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Campus campus = new Campus();
				
				String[] campusRow = line.split(",");
				
				campus.setCAMPUS_ID(Integer.parseInt(campusRow[0]));
				campus.setCAMPUS_CODE(campusRow[1]);
				campus.setCAMPUS_NAME(campusRow[2]);
				campus.setCAMPUS_DESCRIPTION(campusRow[3]);
				
				campuses.add(campus);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return campuses;
	}

	@SuppressWarnings("resource")
	public static Campus findOne(int campus_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Campus.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Campus campus = new Campus();
				
				String[] campusRow = line.split(",");
				
				if (Integer.parseInt(campusRow[0]) == campus_ID) {
					campus.setCAMPUS_ID(Integer.parseInt(campusRow[0]));
					campus.setCAMPUS_CODE(campusRow[1]);
					campus.setCAMPUS_NAME(campusRow[2]);
					campus.setCAMPUS_DESCRIPTION(campusRow[3]);
					
					return campus;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static Campus deleteOne(int campus_ID)  {
		FileWriter filewriter;

		List<Campus> campuses = findAll();
		Campus campus = findOne(campus_ID);

		try {
			filewriter = new FileWriter("Campus.csv");

			for (int i=0; i<campuses.size(); i++) {
				if (campuses.get(i).getCAMPUS_ID() != campus_ID) {
					filewriter.append(campuses.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return campus;
	}

	@SuppressWarnings("resource")
	public static List<Campus> search(String search)  {
		List<Campus> campuses = new ArrayList<Campus>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Campus.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Campus campus = new Campus();
				
				String[] campusRow = line.split(",");
				
				if (campusRow[1].contains(search) == true) {
					campus.setCAMPUS_ID(Integer.parseInt(campusRow[0]));
					campus.setCAMPUS_CODE(campusRow[1]);
					campus.setCAMPUS_NAME(campusRow[2]);
					campus.setCAMPUS_DESCRIPTION(campusRow[3]);
					
					campuses.add(campus);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return campuses;
	}

	public static Campus Save(Campus campus) {
		FileWriter filewriter;

		List<Campus> campuses = findAll();

		try {
			filewriter = new FileWriter("Campus.csv");

			for (int i=0; i<campuses.size(); i++) {
				filewriter.append(campuses.get(i).toString());
				filewriter.append("\n");
			}
			if (campuses.size()>0)
				campus.setCAMPUS_ID(campuses.get(campuses.size()-1).getCAMPUS_ID()+1);
			else
				campus.setCAMPUS_ID(1);
			filewriter.append(campus.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return campus;
	}
}