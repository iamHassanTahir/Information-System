package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.CourseModule;

public class coursemoduleData {
	@SuppressWarnings("resource")
	public static List<CourseModule> findAll()  {
		List<CourseModule> coursemodules = new ArrayList<CourseModule>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseModule.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseModule coursemodule = new CourseModule();
				
				String[] coursemoduleRow = line.split(",");
				
				coursemodule.setCOURSEMODULE_ID(Integer.parseInt(coursemoduleRow[0]));
				
				coursemodules.add(coursemodule);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return coursemodules;
	}

	@SuppressWarnings("resource")
	public static CourseModule findOne(int coursemodule_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseModule.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseModule coursemodule = new CourseModule();
				
				String[] coursemoduleRow = line.split(",");
				
				if (Integer.parseInt(coursemoduleRow[0]) == coursemodule_ID) {
					coursemodule.setCOURSEMODULE_ID(Integer.parseInt(coursemoduleRow[0]));
					
					return coursemodule;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static CourseModule deleteOne(int coursemodule_ID)  {
		FileWriter filewriter;

		List<CourseModule> coursemodules = findAll();
		CourseModule coursemodule = findOne(coursemodule_ID);

		try {
			filewriter = new FileWriter("CourseModule.csv");

			for (int i=0; i<coursemodules.size(); i++) {
				if (coursemodules.get(i).getCOURSEMODULE_ID() != coursemodule_ID) {
					filewriter.append(coursemodules.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return coursemodule;
	}

	@SuppressWarnings("resource")
	public static List<CourseModule> search(String search)  {
		List<CourseModule> coursemodules = new ArrayList<CourseModule>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseModule.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseModule coursemodule = new CourseModule();
				
				String[] coursemoduleRow = line.split(",");
				
				if (coursemoduleRow[1].contains(search) == true) {
					coursemodule.setCOURSEMODULE_ID(Integer.parseInt(coursemoduleRow[0]));
					
					coursemodules.add(coursemodule);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return coursemodules;
	}

	public static CourseModule Save(CourseModule coursemodule) {
		FileWriter filewriter;

		List<CourseModule> coursemodules = findAll();

		try {
			filewriter = new FileWriter("CourseModule.csv");

			for (int i=0; i<coursemodules.size(); i++) {
				filewriter.append(coursemodules.get(i).toString());
				filewriter.append("\n");
			}
			if (coursemodules.size()>0)
				coursemodule.setCOURSEMODULE_ID(coursemodules.get(coursemodules.size()-1).getCOURSEMODULE_ID()+1);
			else
				coursemodule.setCOURSEMODULE_ID(1);
			filewriter.append(coursemodule.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return coursemodule;
	}
}