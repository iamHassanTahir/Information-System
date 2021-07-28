package com.uog.project.menu;

import java.util.Scanner;
import java.util.List;

import com.uog.project.model.Campus;
import com.uog.project.data.campusData;

public class campusInterface {
	public static void CampusMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Campuses Menu");
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
				System.out.println("Add New Campus");
				System.out.println("---------------------------------");
				Campus campus = new Campus();

				System.out.println("Enter Campus ID: ");
				int id = scan.nextInt();
				campus.setCAMPUS_ID(id);

				System.out.println("Enter Campus Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				campus.setCAMPUS_CODE(code);
				
				System.out.println("Enter Campus Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				campus.setCAMPUS_NAME(name);

				System.out.println("Enter Campus Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				campus.setCAMPUS_DESCRIPTION(desc);


				campus = campusData.Save(campus);
				System.out.println(campus.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Campus");
				System.out.println("---------------------------------");
				System.out.println("Enter Campus ID: ");
				int campus_ID = scan.nextInt();
				
				Campus campusdelete = campusData.deleteOne(campus_ID);
				System.out.println(campusdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Campuss Data");
				System.out.println("---------------------------------");
				List<Campus> campuss = campusData.findAll();
				for (int i=0; i<campuss.size(); i++) {
					System.out.println(campuss.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Campus");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Campus> campussearch = campusData.search(search);
				for (int i=0; i<campussearch.size(); i++) {
					System.out.println(campussearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
	
}
