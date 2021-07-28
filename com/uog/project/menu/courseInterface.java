package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.courseData;
import com.uog.project.model.Course;

public class courseInterface {
	public static void CourseMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Courses Menu");
			System.out.println("=====================================================");
			System.out.println("1.   Insert");
			System.out.println("2.   Find By Code");
			System.out.println("3.   Show");
			System.out.println("4.   Search");
			System.out.println("5.   Delete All");
			System.out.println("10.   Back");
			System.out.print("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("---------------------------------");
				System.out.println("Add New Course");
				System.out.println("---------------------------------");
				Course course = new Course();
				
				System.out.println("Enter Course ID: ");
				int id = scan.nextInt();
				course.setCOURSE_ID(id);

				System.out.println("Enter Course Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				course.setCOURSE_CODE(code);
				
				System.out.println("Enter Course Title: ");
				String title = scan.nextLine();
				title+=scan.nextLine();
				course.setCOURSE_TITLE(title);
				
				System.out.println("Enter Course Introduction: ");
				String intro = scan.nextLine();
				intro+=scan.nextLine();
				course.setCOURSE_INTRODUCTION(intro);
				
				System.out.println("Enter Course Short Title: ");
				String shorttitle = scan.nextLine();
				shorttitle+=scan.nextLine();
				course.setCOURSE_SHORTTITLE(shorttitle);

				course = courseData.Save(course);
				System.out.println(course.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Find Course by Code");
				System.out.println("---------------------------------");
				System.out.println("Enter Course Code: ");
				String course_CODE = scan.nextLine();
				
				Course coursefind = courseData.findByCode(course_CODE);
				System.out.println(coursefind.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Courses Data");
				System.out.println("---------------------------------");
				List<Course> courses = courseData.findAll();
				for (int i=0; i<courses.size(); i++) {
					System.out.println(courses.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Course");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Course> coursesearch = courseData.search(search);
				for (int i=0; i<coursesearch.size(); i++) {
					System.out.println(coursesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
