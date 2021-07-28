package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.moduleData;
import com.uog.project.model.Module;

public class moduleInterface {
	public static void ModuleMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Modules Menu");
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
				System.out.println("Add New Module");
				System.out.println("---------------------------------");
				Module module = new Module();
				
				System.out.println("Enter Module ID: ");
				int id = scan.nextInt();
				module.setMODULE_ID(id);
				
				System.out.println("Enter Module Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				module.setMODULE_CODE(code);
				
				System.out.println("Enter Module Introduction: ");
				String intro = scan.nextLine();
				intro+=scan.nextLine();
				module.setMODULE_INTRODUCTION(intro);
				
				System.out.println("Enter Module Title: ");
				String title = scan.nextLine();
				title+=scan.nextLine();
				module.setMODULE_TITLE(title);

				System.out.println("Enter Guided Learning Hours: ");
				int glhours = scan.nextInt();
				module.setGUIDEDLEARNING_HOURS(glhours);
				
				System.out.println("Enter Module No: ");
				int no = scan.nextInt();
				module.setMODULE_NO(no);
				
				System.out.println("Enter Module Level: ");
				int level = scan.nextInt();
				module.setMODULE_LEVEL(level);
				
				System.out.println("Enter Credit Hours: ");
				int hours = scan.nextInt();
				module.setCREDIT_HOURS(hours);

				module = moduleData.Save(module);
				System.out.println(module.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Module");
				System.out.println("---------------------------------");
				System.out.println("Enter Module ID: ");
				int module_ID = scan.nextInt();
				
				Module moduledelete = moduleData.deleteOne(module_ID);
				System.out.println(moduledelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Modules Data");
				System.out.println("---------------------------------");
				List<Module> modules = moduleData.findAll();
				for (int i=0; i<modules.size(); i++) {
					System.out.println(modules.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Module");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Module> modulesearch = moduleData.search(search);
				for (int i=0; i<modulesearch.size(); i++) {
					System.out.println(modulesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
