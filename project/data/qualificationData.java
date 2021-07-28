package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.Qualification;

public class qualificationData {
	@SuppressWarnings("resource")
	public static List<Qualification> findAll()  {
		List<Qualification> qualifications = new ArrayList<Qualification>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Qualification.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Qualification qualification = new Qualification();
				
				String[] qualificationRow = line.split(",");
				
				qualification.setQUALIFICATION_ID(Integer.parseInt(qualificationRow[0]));
				qualification.setQUALIFICATION_CODE(qualificationRow[1]);
				qualification.setQUALIFICATION_NAME(qualificationRow[2]);
				qualification.setQUALIFICATION_DESCRIPTION(qualificationRow[3]);
				
				qualifications.add(qualification);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qualifications;
	}

	@SuppressWarnings("resource")
	public static Qualification findOne(int qualification_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Qualification.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Qualification qualification = new Qualification();
				
				String[] qualificationRow = line.split(",");
				
				if (Integer.parseInt(qualificationRow[0]) == qualification_ID) {
					qualification.setQUALIFICATION_ID(Integer.parseInt(qualificationRow[0]));
					qualification.setQUALIFICATION_CODE(qualificationRow[1]);
					qualification.setQUALIFICATION_NAME(qualificationRow[2]);
					qualification.setQUALIFICATION_DESCRIPTION(qualificationRow[3]);
					
					return qualification;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static Qualification deleteOne(int qualification_ID)  {
		FileWriter filewriter;

		List<Qualification> qualifications = findAll();
		Qualification qualification = findOne(qualification_ID);

		try {
			filewriter = new FileWriter("Qualification.csv");

			for (int i=0; i<qualifications.size(); i++) {
				if (qualifications.get(i).getQUALIFICATION_ID() != qualification_ID) {
					filewriter.append(qualifications.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qualification;
	}

	@SuppressWarnings("resource")
	public static List<Qualification> search(String search)  {
		List<Qualification> qualifications = new ArrayList<Qualification>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Qualification.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Qualification qualification = new Qualification();
				
				String[] qualificationRow = line.split(",");
				
				if (qualificationRow[1].contains(search) == true) {
					qualification.setQUALIFICATION_ID(Integer.parseInt(qualificationRow[0]));
					qualification.setQUALIFICATION_CODE(qualificationRow[1]);
					qualification.setQUALIFICATION_NAME(qualificationRow[2]);
					qualification.setQUALIFICATION_DESCRIPTION(qualificationRow[3]);
					
					qualifications.add(qualification);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return qualifications;
	}

	public static Qualification Save(Qualification qualification) {
		FileWriter filewriter;

		List<Qualification> qualifications = findAll();

		try {
			filewriter = new FileWriter("Qualification.csv");

			for (int i=0; i<qualifications.size(); i++) {
				filewriter.append(qualifications.get(i).toString());
				filewriter.append("\n");
			}
			if (qualifications.size()>0)
				qualification.setQUALIFICATION_ID(qualifications.get(qualifications.size()-1).getQUALIFICATION_ID()+1);
			else
				qualification.setQUALIFICATION_ID(1);
			filewriter.append(qualification.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return qualification;
	}
}
