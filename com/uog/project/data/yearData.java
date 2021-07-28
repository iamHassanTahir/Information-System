package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.AcademicsYear;

public class yearData {
	@SuppressWarnings("resource")
	public static List<AcademicsYear> findAll()  {
		List<AcademicsYear> years = new ArrayList<AcademicsYear>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("AcademicsYear.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				AcademicsYear year = new AcademicsYear();
				
				String[] yearRow = line.split(",");
				
				year.setACADEMICSYEAR_ID(Integer.parseInt(yearRow[0]));
				year.setACADEMICSYEAR_DESC(yearRow[1]);
				year.setACADEMICSYEAR_STARTDATE(yearRow[2]);
				year.setACADEMICSYEAR_ENDDATE(yearRow[3]);
				
				years.add(year);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return years;
	}

	@SuppressWarnings("resource")
	public static AcademicsYear findOne(int ACADEMICSYEAR_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("AcademicsYear.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				AcademicsYear year = new AcademicsYear();
				
				String[] yearRow = line.split(",");
				
				if (Integer.parseInt(yearRow[0]) == ACADEMICSYEAR_ID) {
					year.setACADEMICSYEAR_ID(Integer.parseInt(yearRow[0]));
					year.setACADEMICSYEAR_DESC(yearRow[1]);
					year.setACADEMICSYEAR_STARTDATE(yearRow[2]);
					year.setACADEMICSYEAR_ENDDATE(yearRow[3]);
					
					return year;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static AcademicsYear deleteOne(int ACADEMICSYEAR_ID)  {
		FileWriter filewriter;

		List<AcademicsYear> years = findAll();
		AcademicsYear year = findOne(ACADEMICSYEAR_ID);

		try {
			filewriter = new FileWriter("AcademicsYear.csv");

			for (int i=0; i<years.size(); i++) {
				if (years.get(i).getACADEMICSYEAR_ID() != ACADEMICSYEAR_ID) {
					filewriter.append(years.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return year;
	}

	@SuppressWarnings("resource")
	public static List<AcademicsYear> search(String search)  {
		List<AcademicsYear> years = new ArrayList<AcademicsYear>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("AcademicsYear.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				AcademicsYear year = new AcademicsYear();
				
				String[] yearRow = line.split(",");
				
				if (yearRow[1].contains(search) == true) {
					year.setACADEMICSYEAR_ID(Integer.parseInt(yearRow[0]));
					year.setACADEMICSYEAR_DESC(yearRow[1]);
					year.setACADEMICSYEAR_STARTDATE(yearRow[2]);
					year.setACADEMICSYEAR_ENDDATE(yearRow[3]);
					
					years.add(year);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return years;
	}

	public static AcademicsYear Save(AcademicsYear year) {
		FileWriter filewriter;

		List<AcademicsYear> years = findAll();

		try {
			filewriter = new FileWriter("AcademicsYear.csv");

			for (int i=0; i<years.size(); i++) {
				filewriter.append(years.get(i).toString());
				filewriter.append("\n");
			}
			if (years.size()>0)
				year.setACADEMICSYEAR_ID(years.get(years.size()-1).getACADEMICSYEAR_ID()+1);
			else
				year.setACADEMICSYEAR_ID(1);
			filewriter.append(year.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return year;
	}
}
