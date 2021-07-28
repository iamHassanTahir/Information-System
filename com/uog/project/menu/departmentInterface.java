package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.departmentData;
import com.uog.project.model.Department;

public class departmentInterface {
	public static void DepartmentMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Departments Menu");
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
				System.out.println("Add New Department");
				System.out.println("---------------------------------");
				Department department = new Department();
				
				System.out.println("Enter Department ID: ");
				int id = scan.nextInt();
				department.setDEPARTMENT_ID(id);

				System.out.println("Enter Department Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				department.setDEPARTMENT_CODE(code);
				
				System.out.println("Enter Department Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				department.setDEPARTMENT_NAME(name);

				System.out.println("Enter Department Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				department.setDEPARTMENT_DESCRIPTION(desc);

				department = departmentData.Save(department);
				System.out.println(department.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Department");
				System.out.println("---------------------------------");
				System.out.println("Enter Department ID: ");
				int department_ID = scan.nextInt();
				
				Department departmentdelete = departmentData.deleteOne(department_ID);
				System.out.println(departmentdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Departments Data");
				System.out.println("---------------------------------");
				List<Department> departments = departmentData.findAll();
				for (int i=0; i<departments.size(); i++) {
					System.out.println(departments.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Department");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Department> departmentsearch = departmentData.search(search);
				for (int i=0; i<departmentsearch.size(); i++) {
					System.out.println(departmentsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
