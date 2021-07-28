package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.lookupData;
import com.uog.project.model.Lookup;

public class lookupInterface {
	public static void LookupMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Lookups Menu");
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
				System.out.println("Add New Lookup");
				System.out.println("---------------------------------");
				Lookup lookup = new Lookup();
				
				System.out.println("Enter Lookup ID: ");
				int id = scan.nextInt();
				lookup.setID(id);
				
				System.out.println("Enter Lookup Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				lookup.setENTITYNAME(name);

				System.out.println("Enter Lookup Status: ");
				String status = scan.nextLine();
				status+=scan.nextLine();
				lookup.setENTITY_STATUS(status);
				
				System.out.println("Enter Lookup Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				lookup.setDESCRIPTION(desc);
				
				System.out.println("Enter Lookup Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				lookup.setCODE(code);

				lookup = lookupData.Save(lookup);
				System.out.println(lookup.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Lookup");
				System.out.println("---------------------------------");
				System.out.println("Enter Lookup ID: ");
				int lookup_ID = scan.nextInt();
				
				Lookup lookupdelete = lookupData.deleteOne(lookup_ID);
				System.out.println(lookupdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Lookups Data");
				System.out.println("---------------------------------");
				List<Lookup> lookups = lookupData.findAll();
				for (int i=0; i<lookups.size(); i++) {
					System.out.println(lookups.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Lookup");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Lookup> lookupsearch = lookupData.search(search);
				for (int i=0; i<lookupsearch.size(); i++) {
					System.out.println(lookupsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
