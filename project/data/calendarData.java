package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.AcademicsCalendar;

public class calendarData {

	@SuppressWarnings("resource")
	public static List<AcademicsCalendar> findAll()  {
		List<AcademicsCalendar> calendars = new ArrayList<AcademicsCalendar>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("AcademicsCalendar.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				AcademicsCalendar calendar = new AcademicsCalendar();
				
				String[] calendarRow = line.split(",");
				
				calendar.setACADEMICSCALENDAR_ID(Integer.parseInt(calendarRow[0]));
				calendar.setACADEMICSCALENDAR_DESC(calendarRow[1]);
				calendar.setACADEMICSCALENDAR_STARTDATE(calendarRow[2]);
				calendar.setACADEMICSCALENDAR_ENDDATE(calendarRow[3]);
				
				calendars.add(calendar);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return calendars;
	}

	@SuppressWarnings("resource")
	public static AcademicsCalendar findOne(int room_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("AcademicsCalendar.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				AcademicsCalendar calendar = new AcademicsCalendar();
				
				String[] calendarRow = line.split(",");
				
				if (Integer.parseInt(calendarRow[0]) == room_ID) {
					calendar.setACADEMICSCALENDAR_ID(Integer.parseInt(calendarRow[0]));
					calendar.setACADEMICSCALENDAR_DESC(calendarRow[1]);
					calendar.setACADEMICSCALENDAR_STARTDATE(calendarRow[2]);
					calendar.setACADEMICSCALENDAR_ENDDATE(calendarRow[3]);
					
					return calendar;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static AcademicsCalendar deleteOne(int calendar_ID)  {
		FileWriter filewriter;

		List<AcademicsCalendar> calendars = findAll();
		AcademicsCalendar calendar = findOne(calendar_ID);

		try {
			filewriter = new FileWriter("AcademicsCalendar.csv");

			for (int i=0; i<calendars.size(); i++) {
				if (calendars.get(i).getACADEMICSCALENDAR_ID() != calendar_ID) {
					filewriter.append(calendars.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return calendar;
	}

	@SuppressWarnings("resource")
	public static List<AcademicsCalendar> search(String search)  {
		List<AcademicsCalendar> calendars = new ArrayList<AcademicsCalendar>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("AcademicsCalendar.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				AcademicsCalendar calendar = new AcademicsCalendar();
				
				String[] calendarRow = line.split(",");
				
				if (calendarRow[1].contains(search) == true) {
					calendar.setACADEMICSCALENDAR_ID(Integer.parseInt(calendarRow[0]));
					calendar.setACADEMICSCALENDAR_DESC(calendarRow[1]);
					calendar.setACADEMICSCALENDAR_STARTDATE(calendarRow[2]);
					calendar.setACADEMICSCALENDAR_ENDDATE(calendarRow[3]);
					
					calendars.add(calendar);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return calendars;
	}

	public static AcademicsCalendar Save(AcademicsCalendar calendar) {
		FileWriter filewriter;

		List<AcademicsCalendar> calendars = findAll();

		try {
			filewriter = new FileWriter("AcademicsCalendar.csv");

			for (int i=0; i<calendars.size(); i++) {
				filewriter.append(calendars.get(i).toString());
				filewriter.append("\n");
			}
			if (calendars.size()>0)
				calendar.setACADEMICSCALENDAR_ID(calendars.get(calendars.size()-1).getACADEMICSCALENDAR_ID()+1);
			else
				calendar.setACADEMICSCALENDAR_ID(1);
			filewriter.append(calendars.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return calendar;
	}
}
