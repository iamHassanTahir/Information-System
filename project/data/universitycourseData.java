package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.UniversityCourse;

public class universitycourseData {
	@SuppressWarnings("resource")
	public static List<UniversityCourse> findAll()  {
		List<UniversityCourse> unicourses = new ArrayList<UniversityCourse>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("UniversityCourse.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				UniversityCourse unicourse = new UniversityCourse();
				
				String[] unicourseRow = line.split(",");
				
				unicourse.setUNIVERSITYCOURSE_ID(Integer.parseInt(unicourseRow[0]));
				
				unicourses.add(unicourse);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return unicourses;
	}

	@SuppressWarnings("resource")
	public static UniversityCourse findOne(int unicourse_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("UniversityCourse.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				UniversityCourse unicourse = new UniversityCourse();
				
				String[] unicourseRow = line.split(",");
				
				if (Integer.parseInt(unicourseRow[0]) == unicourse_ID) {
					unicourse.setUNIVERSITYCOURSE_ID(Integer.parseInt(unicourseRow[0]));
					
					return unicourse;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static UniversityCourse deleteOne(int unicourse_ID)  {
		FileWriter filewriter;

		List<UniversityCourse> unicourses = findAll();
		UniversityCourse unicourse = findOne(unicourse_ID);

		try {
			filewriter = new FileWriter("UniversityCourse.csv");

			for (int i=0; i<unicourses.size(); i++) {
				if (unicourses.get(i).getUNIVERSITYCOURSE_ID() != unicourse_ID) {
					filewriter.append(unicourses.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return unicourse;
	}

	@SuppressWarnings("resource")
	public static List<UniversityCourse> search(String search)  {
		List<UniversityCourse> unicourses = new ArrayList<UniversityCourse>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("UniversityCourse.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				UniversityCourse unicourse = new UniversityCourse();
				
				String[] unicourseRow = line.split(",");
				
				if (unicourseRow[1].contains(search) == true) {
					unicourse.setUNIVERSITYCOURSE_ID(Integer.parseInt(unicourseRow[0]));
					
					unicourses.add(unicourse);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return unicourses;
	}

	public static UniversityCourse Save(UniversityCourse unicourse) {
		FileWriter filewriter;

		List<UniversityCourse> unicourses = findAll();

		try {
			filewriter = new FileWriter("UniversityCourse.csv");

			for (int i=0; i<unicourses.size(); i++) {
				filewriter.append(unicourses.get(i).toString());
				filewriter.append("\n");
			}
			if (unicourses.size()>0)
				unicourse.setUNIVERSITYCOURSE_ID(unicourses.get(unicourses.size()-1).getUNIVERSITYCOURSE_ID()+1);
			else
				unicourse.setUNIVERSITYCOURSE_ID(1);
			filewriter.append(unicourse.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return unicourse;
	}
}
