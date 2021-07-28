package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.timeslotData;
import com.uog.project.model.SemesterTimeSlot;

public class timeslotInterface {
	public static void SemesterTimeSlotMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("SemesterTimeSlots Menu");
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
				System.out.println("Add New SemesterTimeSlot");
				System.out.println("---------------------------------");
				SemesterTimeSlot timeslot = new SemesterTimeSlot();
				
				System.out.println("Enter TimeSlot ID: ");
				int id = scan.nextInt();
				timeslot.setTIMESLOT_ID(id);

				System.out.println("Enter TimeSlot Start: ");
				String start = scan.nextLine();
				start+=scan.nextLine();
				timeslot.setTIMESLOT_START(start);
				
				System.out.println("Enter TimeSlot End: ");
				String end = scan.nextLine();
				end+=scan.nextLine();
				timeslot.setTIMESLOT_END(end);

				timeslot = timeslotData.Save(timeslot);
				System.out.println(timeslot.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete SemesterTimeSlot");
				System.out.println("---------------------------------");
				System.out.println("Enter SemesterTimeSlot ID: ");
				int timeslot_ID = scan.nextInt();
				
				SemesterTimeSlot timeslotdelete = timeslotData.deleteOne(timeslot_ID);
				System.out.println(timeslotdelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All SemesterTimeSlots Data");
				System.out.println("---------------------------------");
				List<SemesterTimeSlot> timeslots = timeslotData.findAll();
				for (int i=0; i<timeslots.size(); i++) {
					System.out.println(timeslots.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search SemesterTimeSlot");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<SemesterTimeSlot> timeslotsearch = timeslotData.search(search);
				for (int i=0; i<timeslotsearch.size(); i++) {
					System.out.println(timeslotsearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
