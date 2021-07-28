package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.IntakeCourse;

public class intakecourseData {
	@SuppressWarnings("resource")
	public static List<IntakeCourse> findAll()  {
		List<IntakeCourse> intakecourses = new ArrayList<IntakeCourse>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("IntakeCourse.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				IntakeCourse intakecourse = new IntakeCourse();
				
				String[] intakecourseRow = line.split(",");
				
				intakecourse.setINTAKECOURSE_ID(Integer.parseInt(intakecourseRow[0]));
				intakecourse.setINTAKECOURSE_STARTDATE(intakecourseRow[1]);
				intakecourse.setINTAKECOURSE_ENDDATE(intakecourseRow[4]);
				
				intakecourses.add(intakecourse);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intakecourses;
	}

	@SuppressWarnings("resource")
	public static IntakeCourse findOne(int intakecourse_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("IntakeCourse.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				IntakeCourse intakecourse = new IntakeCourse();
				
				String[] intakecourseRow = line.split(",");
				
				if (Integer.parseInt(intakecourseRow[0]) == intakecourse_ID) {
					intakecourse.setINTAKECOURSE_ID(Integer.parseInt(intakecourseRow[0]));
					intakecourse.setINTAKECOURSE_STARTDATE(intakecourseRow[1]);
					intakecourse.setINTAKECOURSE_ENDDATE(intakecourseRow[4]);
					
					return intakecourse;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static IntakeCourse deleteOne(int intakecourse_ID)  {
		FileWriter filewriter;

		List<IntakeCourse> intakecourses = findAll();
		IntakeCourse intakecourse = findOne(intakecourse_ID);

		try {
			filewriter = new FileWriter("IntakeCourse.csv");

			for (int i=0; i<intakecourses.size(); i++) {
				if (intakecourses.get(i).getINTAKECOURSE_ID() != intakecourse_ID) {
					filewriter.append(intakecourses.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intakecourse;
	}

	@SuppressWarnings("resource")
	public static List<IntakeCourse> search(String search)  {
		List<IntakeCourse> intakecourses = new ArrayList<IntakeCourse>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("IntakeCourse.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				IntakeCourse intakecourse = new IntakeCourse();
				
				String[] intakecourseRow = line.split(",");
				
				if (intakecourseRow[1].contains(search) == true) {
					intakecourse.setINTAKECOURSE_ID(Integer.parseInt(intakecourseRow[0]));
					intakecourse.setINTAKECOURSE_STARTDATE(intakecourseRow[1]);
					intakecourse.setINTAKECOURSE_ENDDATE(intakecourseRow[4]);
					
					intakecourses.add(intakecourse);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return intakecourses;
	}

	public static IntakeCourse Save(IntakeCourse intakecourse) {
		FileWriter filewriter;

		List<IntakeCourse> intakecourses = findAll();

		try {
			filewriter = new FileWriter("IntakeCourse.csv");

			for (int i=0; i<intakecourses.size(); i++) {
				filewriter.append(intakecourses.get(i).toString());
				filewriter.append("\n");
			}
			if (intakecourses.size()>0)
				intakecourse.setINTAKECOURSE_ID(intakecourses.get(intakecourses.size()-1).getINTAKECOURSE_ID()+1);
			else
				intakecourse.setINTAKECOURSE_ID(1);
			filewriter.append(intakecourse.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return intakecourse;
	}
}