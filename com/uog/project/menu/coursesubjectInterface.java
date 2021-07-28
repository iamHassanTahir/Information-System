package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.coursesubjectData;
import com.uog.project.model.CourseSubject;

public class coursesubjectInterface {
	public static void CourseSubjectMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("CourseSubjects Menu");
			System.out.println("=====================================================");
			System.out.println("1.   Insert");
			System.out.println("2.   Delete");
			System.out.println("3.   Show");
			System.out.println("4.   Search");
			System.out.println("5.   Delete All");
			System.out.println("10.   Back");
			System.out.print("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("---------------------------------");
				System.out.println("Add New CourseSubject");
				System.out.println("---------------------------------");
				CourseSubject coursesubject = new CourseSubject();

				System.out.println("Enter CourseSubject ID: ");
				int id = scan.nextInt();
				coursesubject.setCOURSESUBJECT_ID(id);

				System.out.println("Enter CourseSubject Percentage: ");
				int per = scan.nextInt();
				coursesubject.setSUBJECT_PERCENTAGE(per);


				coursesubject = coursesubjectData.Save(coursesubject);
				System.out.println(coursesubject.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete CourseSubject");
				System.out.println("---------------------------------");
				System.out.println("Enter CourseSubject ID: ");
				int coursesubject_ID = scan.nextInt();
				
				CourseSubject coursesubjectdelete = coursesubjectData.deleteOne(coursesubject_ID);
				System.out.println(coursesubjectdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All CourseSubjects Data");
				System.out.println("---------------------------------");
				List<CourseSubject> coursesubjects = coursesubjectData.findAll();
				for (int i=0; i<coursesubjects.size(); i++) {
					System.out.println(coursesubjects.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search CourseSubject");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<CourseSubject> coursesubjectsearch = coursesubjectData.search(search);
				for (int i=0; i<coursesubjectsearch.size(); i++) {
					System.out.println(coursesubjectsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
