package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.universitycourseData;
import com.uog.project.model.UniversityCourse;

public class universitycourseInterface {
	public static void UniversityCourseMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("UniversityCourses Menu");
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
				System.out.println("Add New UniversityCourse");
				System.out.println("---------------------------------");
				UniversityCourse unicourse = new UniversityCourse();
				
				System.out.println("Enter University Course ID: ");
				int id = scan.nextInt();
				unicourse.setUNIVERSITYCOURSE_ID(id);

				unicourse = universitycourseData.Save(unicourse);
				System.out.println(unicourse.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete UniversityCourse");
				System.out.println("---------------------------------");
				System.out.println("Enter UniversityCourse ID: ");
				int unicourse_ID = scan.nextInt();
				
				UniversityCourse unicoursedelete = universitycourseData.deleteOne(unicourse_ID);
				System.out.println(unicoursedelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All UniversityCourses Data");
				System.out.println("---------------------------------");
				List<UniversityCourse> unicourses = universitycourseData.findAll();
				for (int i=0; i<unicourses.size(); i++) {
					System.out.println(unicourses.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search UniversityCourse");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<UniversityCourse> unicoursesearch = universitycourseData.search(search);
				for (int i=0; i<unicoursesearch.size(); i++) {
					System.out.println(unicoursesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
