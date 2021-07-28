package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.collegeData;
import com.uog.project.model.College;

public class collegeInterface {
	public static void CollegeMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Colleges Menu");
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
				System.out.println("Add New College");
				System.out.println("---------------------------------");
				College college = new College();
				
				System.out.println("Enter College ID: ");
				int id = scan.nextInt();
				college.setCOLLEGE_ID(id);

				System.out.println("Enter College Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				college.setCOLLEGE_CODE(code);
				
				System.out.println("Enter College Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				college.setCOLLEGE_NAME(name);

				System.out.println("Enter College Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				college.setCOLLEGE_DESCRIPTION(desc);

				college = collegeData.Save(college);
				System.out.println(college.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete College");
				System.out.println("---------------------------------");
				System.out.println("Enter College ID: ");
				int college_ID = scan.nextInt();
				
				College collegedelete = collegeData.deleteOne(college_ID);
				System.out.println(collegedelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Colleges Data");
				System.out.println("---------------------------------");
				List<College> colleges = collegeData.findAll();
				for (int i=0; i<colleges.size(); i++) {
					System.out.println(colleges.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search College");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<College> collegesearch = collegeData.search(search);
				for (int i=0; i<collegesearch.size(); i++) {
					System.out.println(collegesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
