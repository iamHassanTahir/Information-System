package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.universityData;
import com.uog.project.model.University;

public class universityInterface {
	public static void UniversityMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Universitys Menu");
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
				System.out.println("Add New University");
				System.out.println("---------------------------------");
				University university = new University();

				System.out.println("Enter University ID: ");
				int id = scan.nextInt();
				university.setUNIVERSITY_ID(id);
				
				System.out.println("Enter University Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				university.setUNIVERSITY_NAME(name);

				System.out.println("Enter University Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				university.setUNIVERSITY_CODE(code);
				
				System.out.println("Enter University Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				university.setUNIVERSITY_DESCRIPTION(desc);

				university = universityData.Save(university);
				System.out.println(university.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete University");
				System.out.println("---------------------------------");
				System.out.println("Enter University ID: ");
				int university_ID = scan.nextInt();
				
				University universitydelete = universityData.deleteOne(university_ID);
				System.out.println(universitydelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Universitys Data");
				System.out.println("---------------------------------");
				List<University> universitys = universityData.findAll();
				for (int i=0; i<universitys.size(); i++) {
					System.out.println(universitys.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search University");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<University> universitysearch = universityData.search(search);
				for (int i=0; i<universitysearch.size(); i++) {
					System.out.println(universitysearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
