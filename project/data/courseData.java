package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.Course;


public class courseData {


	@SuppressWarnings("resource")
	public static List<Course> findAll()  {
		List<Course> courses = new ArrayList<Course>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Course.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Course course = new Course();
				
				String[] courseRow = line.split(",");
				
				course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
				course.setCOURSE_CODE(courseRow[1]);
				course.setCOURSE_TITLE(courseRow[2]);
				course.setCOURSE_INTRODUCTION(courseRow[3]);
				course.setCOURSE_SHORTTITLE(courseRow[4]);
				
				courses.add(course);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return courses;
	}

	@SuppressWarnings("resource")
	public Course findOne(int course_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Course.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Course course = new Course();
				
				String[] courseRow = line.split(",");
				
				if (Integer.parseInt(courseRow[0]) == course_ID) {
					course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
					course.setCOURSE_CODE(courseRow[1]);
					course.setCOURSE_TITLE(courseRow[2]);
					course.setCOURSE_SHORTTITLE(courseRow[3]);
					course.setCOURSE_INTRODUCTION(courseRow[4]);
										
					return course;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings("resource")
	public static Course findByCode(String course_CODE)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Course.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Course course = new Course();

				String[] courseRow = line.split(",");
				
				if (courseRow[1].contains(course_CODE) == true) {
					course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
					course.setCOURSE_CODE(courseRow[1]);
					course.setCOURSE_TITLE(courseRow[2]);
					course.setCOURSE_SHORTTITLE(courseRow[3]);
					course.setCOURSE_INTRODUCTION(courseRow[4]);
								
					return course;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings("resource")
	public static List<Course> search(String search)  {
		List<Course> courses = new ArrayList<Course>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Course.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Course course = new Course();
				
				String[] courseRow = line.split(",");
				
				if (courseRow[1].contains(search) == true) {
					course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
//					course.setCOURSE_NAME(courseRow[1]);
//					course.setCOURSE_FLOUR(Integer.parseInt(courseRow[2]));
//					course.setCOURSE_CAPACITY(Integer.parseInt(courseRow[3]));
//					course.setCOURSE_TYPE(courseRow[4]);
					
					courses.add(course);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return courses;
	}

	public static Course Save(Course course) {
		FileWriter filewriter;

		List<Course> courses = findAll();

		try {
			filewriter = new FileWriter("Course.csv");

			for (int i=0; i<courses.size(); i++) {
				filewriter.append(courses.get(i).toString());
				filewriter.append("\n");
			}
			if (courses.size()>0)
				course.setCOURSE_ID(courses.get(courses.size()-1).getCOURSE_ID()+1);
			else
				course.setCOURSE_ID(1);
			filewriter.append(course.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return course;
	}
}