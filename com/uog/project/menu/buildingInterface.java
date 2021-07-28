package com.uog.project.menu;

import java.util.Scanner;
import java.util.List;

import com.uog.project.model.Building;
import com.uog.project.data.buildingData;

public class buildingInterface {
	public static void BuildingMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Buildings Menu");
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
				System.out.println("Add New Building");
				System.out.println("---------------------------------");
				Building building = new Building();
				
				System.out.println("Enter Building ID: ");
				int id = scan.nextInt();
				id+=scan.nextInt();
				building.setBUILDING_ID(id);

				System.out.println("Enter Building Code: ");
				String code = scan.nextLine();
				building.setBUILDING_CODE(code);

				System.out.println("Enter Building Name: ");
				String name = scan.nextLine();
				code+=scan.nextLine();
				building.setBUILDING_NAME(name);

				building = buildingData.Save(building);
				System.out.println(building.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Building");
				System.out.println("---------------------------------");
				System.out.println("Enter Building ID: ");
				int building_ID = scan.nextInt();
				
				Building buildingdelete = buildingData.deleteOne(building_ID);
				System.out.println(buildingdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Buildings Data");
				System.out.println("---------------------------------");
				List<Building> buildings = buildingData.findAll();
				for (int i=0; i<buildings.size(); i++) {
					System.out.println(buildings.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Building");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Building> buildingsearch = buildingData.search(search);
				for (int i=0; i<buildingsearch.size(); i++) {
					System.out.println(buildingsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
	
}
