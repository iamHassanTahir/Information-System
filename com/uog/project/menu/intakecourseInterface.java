package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.intakecourseData;
import com.uog.project.model.IntakeCourse;

public class intakecourseInterface {
	public static void IntakeCourseMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("IntakeCourses Menu");
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
				System.out.println("Add New IntakeCourse");
				System.out.println("---------------------------------");
				IntakeCourse intakecourse = new IntakeCourse();

				System.out.println("Enter IntakeCourse ID: ");
				int id = scan.nextInt();
				intakecourse.setINTAKECOURSE_ID(id);

				System.out.println("Enter IntakeCourse Start Date: ");
				String startdate = scan.nextLine();
				startdate+=scan.nextLine();
				intakecourse.setINTAKECOURSE_STARTDATE(startdate);
				
				System.out.println("Enter IntakeCourse End Date: ");
				String enddate = scan.nextLine();
				startdate+=scan.nextLine();
				intakecourse.setINTAKECOURSE_ENDDATE(enddate);

				intakecourse = intakecourseData.Save(intakecourse);
				System.out.println(intakecourse.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete IntakeCourse");
				System.out.println("---------------------------------");
				System.out.println("Enter IntakeCourse ID: ");
				int intakecourse_ID = scan.nextInt();
				
				IntakeCourse intakecoursedelete = intakecourseData.deleteOne(intakecourse_ID);
				System.out.println(intakecoursedelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All IntakeCourses Data");
				System.out.println("---------------------------------");
				List<IntakeCourse> intakecourses = intakecourseData.findAll();
				for (int i=0; i<intakecourses.size(); i++) {
					System.out.println(intakecourses.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search IntakeCourse");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<IntakeCourse> intakecoursesearch = intakecourseData.search(search);
				for (int i=0; i<intakecoursesearch.size(); i++) {
					System.out.println(intakecoursesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
