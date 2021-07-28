package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.intakeData;
import com.uog.project.model.Intake;

public class intakeInterface {
	public static void IntakeMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Intakes Menu");
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
				System.out.println("Add New Intake");
				System.out.println("---------------------------------");
				Intake intake = new Intake();

				System.out.println("Enter Intake ID: ");
				int id = scan.nextInt();
				intake.setINTAKE_ID(id);

				System.out.println("Enter Intake Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				intake.setINTAKE_DESC(desc);
				
				System.out.println("Enter Admission Open or Not: ");
				String open = scan.nextLine();
				open+=scan.nextLine();
				intake.setISADMISSIONOPEN(open);

				intake = intakeData.Save(intake);
				System.out.println(intake.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Intake");
				System.out.println("---------------------------------");
				System.out.println("Enter Intake ID: ");
				int intake_ID = scan.nextInt();
				
				Intake intakedelete = intakeData.deleteOne(intake_ID);
				System.out.println(intakedelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Intakes Data");
				System.out.println("---------------------------------");
				List<Intake> intakes = intakeData.findAll();
				for (int i=0; i<intakes.size(); i++) {
					System.out.println(intakes.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Intake");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Intake> intakesearch = intakeData.search(search);
				for (int i=0; i<intakesearch.size(); i++) {
					System.out.println(intakesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
