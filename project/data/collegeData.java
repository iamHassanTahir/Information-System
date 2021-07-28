package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.College;

public class collegeData {
	@SuppressWarnings("resource")
	public static List<College> findAll()  {
		List<College> colleges = new ArrayList<College>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("College.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				College college = new College();
				
				String[] collegeRow = line.split(",");
				
				college.setCOLLEGE_ID(Integer.parseInt(collegeRow[0]));
				college.setCOLLEGE_CODE(collegeRow[1]);
				college.setCOLLEGE_NAME(collegeRow[2]);
				college.setCOLLEGE_DESCRIPTION(collegeRow[3]);
				
				colleges.add(college);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return colleges;
	}

	@SuppressWarnings("resource")
	public static College findOne(int college_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("College.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				College college = new College();
				
				String[] collegeRow = line.split(",");
				
				if (Integer.parseInt(collegeRow[0]) == college_ID) {
					college.setCOLLEGE_ID(Integer.parseInt(collegeRow[0]));
					college.setCOLLEGE_CODE(collegeRow[1]);
					college.setCOLLEGE_NAME(collegeRow[2]);
					college.setCOLLEGE_DESCRIPTION(collegeRow[3]);
					
					return college;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static College deleteOne(int college_ID)  {
		FileWriter filewriter;

		List<College> colleges = findAll();
		College college = findOne(college_ID);

		try {
			filewriter = new FileWriter("College.csv");

			for (int i=0; i<colleges.size(); i++) {
				if (colleges.get(i).getCOLLEGE_ID() != college_ID) {
					filewriter.append(colleges.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return college;
	}

	@SuppressWarnings("resource")
	public static List<College> search(String search)  {
		List<College> colleges = new ArrayList<College>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("College.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				College college = new College();
				
				String[] collegeRow = line.split(",");
				
				if (collegeRow[1].contains(search) == true) {
					college.setCOLLEGE_ID(Integer.parseInt(collegeRow[0]));
					college.setCOLLEGE_CODE(collegeRow[1]);
					college.setCOLLEGE_NAME(collegeRow[2]);
					college.setCOLLEGE_DESCRIPTION(collegeRow[3]);
					
					colleges.add(college);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return colleges;
	}

	public static College Save(College college) {
		FileWriter filewriter;

		List<College> colleges = findAll();

		try {
			filewriter = new FileWriter("College.csv");

			for (int i=0; i<colleges.size(); i++) {
				filewriter.append(colleges.get(i).toString());
				filewriter.append("\n");
			}
			if (colleges.size()>0)
				college.setCOLLEGE_ID(colleges.get(colleges.size()-1).getCOLLEGE_ID()+1);
			else
				college.setCOLLEGE_ID(1);
			filewriter.append(college.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return college;
	}
}
