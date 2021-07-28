package com.uog.project.menu;

import java.util.Scanner;
import java.util.List;

import com.uog.project.model.AcademicsCalendar;
import com.uog.project.data.calendarData;

public class calendarInterface {
	public static void CalendarMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Calendars Menu");
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
				System.out.println("Add New Calendar");
				System.out.println("---------------------------------");
				AcademicsCalendar calendar = new AcademicsCalendar();
				
				System.out.println("Enter Calendar ID: ");
				int id = scan.nextInt();
				calendar.setACADEMICSCALENDAR_ID(id);
				
				System.out.println("Enter Calendar Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				calendar.setACADEMICSCALENDAR_DESC(desc);

				System.out.println("Enter Calendar Start Date: ");
				String startdate = scan.nextLine();
				startdate+=scan.nextLine();
				calendar.setACADEMICSCALENDAR_STARTDATE(startdate);
				
				System.out.println("Enter Calendar End Date: ");
				String enddate = scan.nextLine();
				enddate+=scan.nextLine();
				calendar.setACADEMICSCALENDAR_ENDDATE(enddate);

				calendar = calendarData.Save(calendar);
				System.out.println(calendar.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Calendar");
				System.out.println("---------------------------------");
				System.out.println("Enter Calendar ID: ");
				int calendar_ID = scan.nextInt();
				
				AcademicsCalendar calendardelete = calendarData.deleteOne(calendar_ID);
				System.out.println(calendardelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All Calendars Data");
				System.out.println("---------------------------------");
				List<AcademicsCalendar> calendars = calendarData.findAll();
				for (int i=0; i<calendars.size(); i++) {
					System.out.println(calendars.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search Calendar");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<AcademicsCalendar> calendarsearch = calendarData.search(search);
				for (int i=0; i<calendarsearch.size(); i++) {
					System.out.println(calendarsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
	
}
