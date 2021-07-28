package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.coursemoduleData;
import com.uog.project.model.CourseModule;

public class coursemoduleInterface {
	public static void CourseModuleMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("CourseModules Menu");
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
				System.out.println("Add New CourseModule");
				System.out.println("---------------------------------");
				CourseModule coursemodule = new CourseModule();

				System.out.println("Enter CourseModule ID: ");
				int id = scan.nextInt();
				coursemodule.setCOURSEMODULE_ID(id);

				coursemodule = coursemoduleData.Save(coursemodule);
				System.out.println(coursemodule.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete CourseModule");
				System.out.println("---------------------------------");
				System.out.println("Enter CourseModule ID: ");
				int coursemodule_ID = scan.nextInt();
				
				CourseModule coursemoduledelete = coursemoduleData.deleteOne(coursemodule_ID);
				System.out.println(coursemoduledelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All CourseModules Data");
				System.out.println("---------------------------------");
				List<CourseModule> coursemodules = coursemoduleData.findAll();
				for (int i=0; i<coursemodules.size(); i++) {
					System.out.println(coursemodules.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search CourseModule");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<CourseModule> coursemodulesearch = coursemoduleData.search(search);
				for (int i=0; i<coursemodulesearch.size(); i++) {
					System.out.println(coursemodulesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
