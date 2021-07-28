package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.yearData;
import com.uog.project.model.AcademicsYear;

public class yearInterface {
	public static void YearMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Years Menu");
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
				System.out.println("Add New Year");
				System.out.println("---------------------------------");
				AcademicsYear year = new AcademicsYear();
				
				System.out.println("Enter Academics Year ID: ");
				int id = scan.nextInt();
				year.setACADEMICSYEAR_ID(id);
				
				System.out.println("Enter Academics Year Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				year.setACADEMICSYEAR_DESC(desc);

				System.out.println("Enter Academics Year Start Date: ");
				String startdate = scan.nextLine();
				startdate+=scan.nextLine();
				year.setACADEMICSYEAR_STARTDATE(startdate);
				
				System.out.println("Enter Academics Year End Date: ");
				String enddate = scan.nextLine();
				enddate+=scan.nextLine();
				year.setACADEMICSYEAR_ENDDATE(enddate);

				year = yearData.Save(year);
				System.out.println(year.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Year");
				System.out.println("---------------------------------");
				System.out.println("Enter Year ID: ");
				int year_ID = scan.nextInt();
				
				AcademicsYear yeardelete = yearData.deleteOne(year_ID);
				System.out.println(yeardelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Years Data");
				System.out.println("---------------------------------");
				List<AcademicsYear> years = yearData.findAll();
				for (int i=0; i<years.size(); i++) {
					System.out.println(years.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Year");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<AcademicsYear> yearsearch = yearData.search(search);
				for (int i=0; i<yearsearch.size(); i++) {
					System.out.println(yearsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
