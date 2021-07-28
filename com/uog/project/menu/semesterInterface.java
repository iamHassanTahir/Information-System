package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.semesterData;
import com.uog.project.model.Semester;

public class semesterInterface {
	public static void SemesterMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Semesters Menu");
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
				System.out.println("Add New Semester");
				System.out.println("---------------------------------");
				Semester semester = new Semester();

				System.out.println("Enter Semester ID: ");
				int id = scan.nextInt();
				semester.setSEMESTER_ID(id);

				System.out.println("Enter Semester Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				semester.setSEMESTER_DESC(desc);

				System.out.println("Enter Semester Start Date: ");
				String startdate = scan.nextLine();
				startdate+=scan.nextLine();
				semester.setSEMESTER_STARTDATE(startdate);
				
				System.out.println("Enter Semester End Date: ");
				String enddate = scan.nextLine();
				enddate+=scan.nextLine();
				semester.setSEMESTER_ENDDATE(enddate);
				
				semester = semesterData.Save(semester);
				System.out.println(semester.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Semester");
				System.out.println("---------------------------------");
				System.out.println("Enter Semester ID: ");
				int semester_ID = scan.nextInt();
				
				Semester semesterdelete = semesterData.deleteOne(semester_ID);
				System.out.println(semesterdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Semesters Data");
				System.out.println("---------------------------------");
				List<Semester> semesters = semesterData.findAll();
				for (int i=0; i<semesters.size(); i++) {
					System.out.println(semesters.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Semester");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Semester> semestersearch = semesterData.search(search);
				for (int i=0; i<semestersearch.size(); i++) {
					System.out.println(semestersearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
