package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.University;

public class universityData {
	@SuppressWarnings("resource")
	public static List<University> findAll()  {
		List<University> universities = new ArrayList<University>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("University.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				University university = new University();
				
				String[] universityRow = line.split(",");
				
				university.setUNIVERSITY_ID(Integer.parseInt(universityRow[0]));
				university.setUNIVERSITY_NAME(universityRow[1]);
				university.setUNIVERSITY_DESCRIPTION(universityRow[2]);
				university.setUNIVERSITY_CODE(universityRow[3]);
				
				universities.add(university);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return universities;
	}

	@SuppressWarnings("resource")
	public static University findOne(int university_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("University.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				University university = new University();
				
				String[] universityRow = line.split(",");
				
				if (Integer.parseInt(universityRow[0]) == university_ID) {
					university.setUNIVERSITY_ID(Integer.parseInt(universityRow[0]));
					university.setUNIVERSITY_NAME(universityRow[1]);
					university.setUNIVERSITY_DESCRIPTION(universityRow[2]);
					university.setUNIVERSITY_CODE(universityRow[3]);
					
					return university;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static University deleteOne(int university_ID)  {
		FileWriter filewriter;

		List<University> universities = findAll();
		University university = findOne(university_ID);

		try {
			filewriter = new FileWriter("University.csv");

			for (int i=0; i<universities.size(); i++) {
				if (universities.get(i).getUNIVERSITY_ID() != university_ID) {
					filewriter.append(universities.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return university;
	}

	@SuppressWarnings("resource")
	public static List<University> search(String search)  {
		List<University> universities = new ArrayList<University>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("University.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				University university = new University();
				
				String[] universityRow = line.split(",");
				
				if (universityRow[1].contains(search) == true) {
					university.setUNIVERSITY_ID(Integer.parseInt(universityRow[0]));
					university.setUNIVERSITY_NAME(universityRow[1]);
					university.setUNIVERSITY_DESCRIPTION(universityRow[2]);
					university.setUNIVERSITY_CODE(universityRow[3]);
					
					universities.add(university);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return universities;
	}

	public static University Save(University university) {
		FileWriter filewriter;

		List<University> universities = findAll();

		try {
			filewriter = new FileWriter("University.csv");

			for (int i=0; i<universities.size(); i++) {
				filewriter.append(universities.get(i).toString());
				filewriter.append("\n");
			}
			if (universities.size()>0)
				university.setUNIVERSITY_ID(universities.get(universities.size()-1).getUNIVERSITY_ID()+1);
			else
				university.setUNIVERSITY_ID(1);
			filewriter.append(university.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return university;
	}
}
