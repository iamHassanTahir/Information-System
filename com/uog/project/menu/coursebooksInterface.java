package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.coursebooksData;
import com.uog.project.model.CourseBooks;

public class coursebooksInterface {
	public static void CourseBooksMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("CourseBookss Menu");
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
				System.out.println("Add New CourseBooks");
				System.out.println("---------------------------------");
				CourseBooks book = new CourseBooks();
				
				System.out.println("Enter CourseBooks Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				book.setCOURSEBOOK_NAME(name);

				System.out.println("Enter CourseBooks ID: ");
				int id = scan.nextInt();
				book.setCOURSEBOOK_ID(id);

				System.out.println("Enter CourseBooks Price: ");
				int price = scan.nextInt();
				book.setCOURSEBOOK_PRICE(price);
				
				System.out.println("Enter CourseBooks Quantity: ");
				int quantity = scan.nextInt();
				book.setCOURSEBOOK_QUANTITY(quantity);

				System.out.println("Enter CourseBooks Catagory: ");
				String catagory = scan.nextLine();
				catagory+=scan.nextLine();
				book.setCOURSEBOOK_CATAGORY(catagory);

				book = coursebooksData.Save(book);
				System.out.println(book.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete CourseBooks");
				System.out.println("---------------------------------");
				System.out.println("Enter CourseBooks ID: ");
				int coursebooks_ID = scan.nextInt();
				
				CourseBooks coursebooksdelete = coursebooksData.deleteOne(coursebooks_ID);
				System.out.println(coursebooksdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All CourseBookss Data");
				System.out.println("---------------------------------");
				List<CourseBooks> coursebookss = coursebooksData.findAll();
				for (int i=0; i<coursebookss.size(); i++) {
					System.out.println(coursebookss.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search CourseBooks");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<CourseBooks> coursebookssearch = coursebooksData.search(search);
				for (int i=0; i<coursebookssearch.size(); i++) {
					System.out.println(coursebookssearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
