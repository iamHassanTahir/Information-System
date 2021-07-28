package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.CourseSubject;

public class coursesubjectData {
	@SuppressWarnings("resource")
	public static List<CourseSubject> findAll()  {
		List<CourseSubject> subjects = new ArrayList<CourseSubject>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseSubject.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseSubject subject = new CourseSubject();
				
				String[] subjectRow = line.split(",");
				
				subject.setCOURSESUBJECT_ID(Integer.parseInt(subjectRow[0]));
				subject.setSUBJECT_PERCENTAGE(Integer.parseInt(subjectRow[2]));
				
				subjects.add(subject);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return subjects;
	}

	@SuppressWarnings("resource")
	public static CourseSubject findOne(int subject_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseSubject.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseSubject subject = new CourseSubject();
				
				String[] subjectRow = line.split(",");
				
				if (Integer.parseInt(subjectRow[0]) == subject_ID) {
					subject.setCOURSESUBJECT_ID(Integer.parseInt(subjectRow[0]));
					subject.setSUBJECT_PERCENTAGE(Integer.parseInt(subjectRow[2]));
					
					return subject;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static CourseSubject deleteOne(int subject_ID)  {
		FileWriter filewriter;

		List<CourseSubject> subjects = findAll();
		CourseSubject subject = findOne(subject_ID);

		try {
			filewriter = new FileWriter("CourseSubject.csv");

			for (int i=0; i<subjects.size(); i++) {
				if (subjects.get(i).getCOURSESUBJECT_ID() != subject_ID) {
					filewriter.append(subjects.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return subject;
	}

	@SuppressWarnings("resource")
	public static List<CourseSubject> search(String search)  {
		List<CourseSubject> subjects = new ArrayList<CourseSubject>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseSubject.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseSubject subject = new CourseSubject();
				
				String[] subjectRow = line.split(",");
				
				if (subjectRow[1].contains(search) == true) {
					subject.setCOURSESUBJECT_ID(Integer.parseInt(subjectRow[0]));
					subject.setSUBJECT_PERCENTAGE(Integer.parseInt(subjectRow[2]));
					
					subjects.add(subject);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return subjects;
	}

	public static CourseSubject Save(CourseSubject subject) {
		FileWriter filewriter;

		List<CourseSubject> subjects = findAll();

		try {
			filewriter = new FileWriter("CourseSubject.csv");

			for (int i=0; i<subjects.size(); i++) {
				filewriter.append(subjects.get(i).toString());
				filewriter.append("\n");
			}
			if (subjects.size()>0)
				subject.setCOURSESUBJECT_ID(subjects.get(subjects.size()-1).getCOURSESUBJECT_ID()+1);
			else
				subject.setCOURSESUBJECT_ID(1);
			filewriter.append(subject.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return subject;
	}
}
