package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.qualificationData;
import com.uog.project.model.Qualification;

public class qualificationInterface {
	public static void QualificationMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Qualifications Menu");
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
				System.out.println("Add New Qualification");
				System.out.println("---------------------------------");
				Qualification qualification = new Qualification();
				
				System.out.println("Enter Qualification ID: ");
				int id = scan.nextInt();
				qualification.setQUALIFICATION_ID(id);
				
				System.out.println("Enter Qualification Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				qualification.setQUALIFICATION_NAME(name);

				System.out.println("Enter Qualification Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				qualification.setQUALIFICATION_CODE(code);
				
				System.out.println("Enter Qualification Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				qualification.setQUALIFICATION_DESCRIPTION(desc);

				qualification = qualificationData.Save(qualification);
				System.out.println(qualification.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Qualification");
				System.out.println("---------------------------------");
				System.out.println("Enter Qualification ID: ");
				int qualification_ID = scan.nextInt();
				
				Qualification qualificationdelete = qualificationData.deleteOne(qualification_ID);
				System.out.println(qualificationdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Qualifications Data");
				System.out.println("---------------------------------");
				List<Qualification> qualifications = qualificationData.findAll();
				for (int i=0; i<qualifications.size(); i++) {
					System.out.println(qualifications.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Qualification");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Qualification> qualificationsearch = qualificationData.search(search);
				for (int i=0; i<qualificationsearch.size(); i++) {
					System.out.println(qualificationsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
