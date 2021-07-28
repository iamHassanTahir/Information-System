package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.SemesterTimeSlot;

public class timeslotData {
	@SuppressWarnings("resource")
	public static List<SemesterTimeSlot> findAll()  {
		List<SemesterTimeSlot> timeslots = new ArrayList<SemesterTimeSlot>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("SemesterTimeSlot.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				SemesterTimeSlot timeslot = new SemesterTimeSlot();
				
				String[] timeslotRow = line.split(",");
				
				timeslot.setTIMESLOT_ID(Integer.parseInt(timeslotRow[0]));
				timeslot.setTIMESLOT_START(timeslotRow[1]);
				timeslot.setTIMESLOT_END(timeslotRow[2]);
				
				timeslots.add(timeslot);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return timeslots;
	}

	@SuppressWarnings("resource")
	public static SemesterTimeSlot findOne(int timeslot_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("SemesterTimeSlot.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				SemesterTimeSlot timeslot = new SemesterTimeSlot();
				
				String[] timeslotRow = line.split(",");
				
				if (Integer.parseInt(timeslotRow[0]) == timeslot_ID) {
					timeslot.setTIMESLOT_ID(Integer.parseInt(timeslotRow[0]));
					timeslot.setTIMESLOT_START(timeslotRow[1]);
					timeslot.setTIMESLOT_END(timeslotRow[2]);
					
					return timeslot;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static SemesterTimeSlot deleteOne(int timeslot_ID)  {
		FileWriter filewriter;

		List<SemesterTimeSlot> timeslots = findAll();
		SemesterTimeSlot timeslot = findOne(timeslot_ID);

		try {
			filewriter = new FileWriter("SemesterTimeSlot.csv");

			for (int i=0; i<timeslots.size(); i++) {
				if (timeslots.get(i).getTIMESLOT_ID() != timeslot_ID) {
					filewriter.append(timeslots.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return timeslot;
	}

	@SuppressWarnings("resource")
	public static List<SemesterTimeSlot> search(String search)  {
		List<SemesterTimeSlot> timeslots = new ArrayList<SemesterTimeSlot>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("SemesterTimeSlot.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				SemesterTimeSlot timeslot = new SemesterTimeSlot();
				
				String[] timeslotRow = line.split(",");
				
				if (timeslotRow[1].contains(search) == true) {
					timeslot.setTIMESLOT_ID(Integer.parseInt(timeslotRow[0]));
					timeslot.setTIMESLOT_START(timeslotRow[1]);
					timeslot.setTIMESLOT_END(timeslotRow[2]);
					
					timeslots.add(timeslot);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return timeslots;
	}

	public static SemesterTimeSlot Save(SemesterTimeSlot timeslot) {
		FileWriter filewriter;

		List<SemesterTimeSlot> timeslots = findAll();

		try {
			filewriter = new FileWriter("SemesterTimeSlot.csv");

			for (int i=0; i<timeslots.size(); i++) {
				filewriter.append(timeslots.get(i).toString());
				filewriter.append("\n");
			}
			if (timeslots.size()>0)
				timeslot.setTIMESLOT_ID(timeslots.get(timeslots.size()-1).getTIMESLOT_ID()+1);
			else
				timeslot.setTIMESLOT_ID(1);
			filewriter.append(timeslot.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return timeslot;
	}
}
