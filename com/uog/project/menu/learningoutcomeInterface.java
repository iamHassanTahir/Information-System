package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.learningoutcomeData;
import com.uog.project.model.ModuleLearningOutcome;

public class learningoutcomeInterface {
	public static void LearningOutcomeMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("LearningOutcomes Menu");
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
				System.out.println("Add New LearningOutcome");
				System.out.println("---------------------------------");
				ModuleLearningOutcome learningoutcome = new ModuleLearningOutcome();

				System.out.println("Enter LearningOutcome ID: ");
				int id = scan.nextInt();
				learningoutcome.setLEARNINGOUTCOME_ID(id);

				System.out.println("Enter LearningOutcome Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				learningoutcome.setLEARNINGOUTCOME_CODE(code);
				
				System.out.println("Enter LearningOutcome No: ");
				int no = scan.nextInt();
				learningoutcome.setLEARNINGOUTCOME_NO(no);

				System.out.println("Enter LearningOutcome Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				learningoutcome.setLEARNINGOUTCOME_DESC(desc);
				
				System.out.println("Enter LearningOutcome Introduction: ");
				String intro = scan.nextLine();
				intro+=scan.nextLine();
				learningoutcome.setLEARNINGOUTCOME_INTRODUCTION(intro);
				
				System.out.println("Enter LearningOutcome ContentLink: ");
				String link = scan.nextLine();
				link+=scan.nextLine();
				learningoutcome.setLEARNINGOUTCOME_CONTENTLINK(link);

				learningoutcome = learningoutcomeData.Save(learningoutcome);
				System.out.println(learningoutcome.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete LearningOutcome");
				System.out.println("---------------------------------");
				System.out.println("Enter LearningOutcome ID: ");
				int learningoutcome_ID = scan.nextInt();
				
				ModuleLearningOutcome learningoutcomedelete = learningoutcomeData.deleteOne(learningoutcome_ID);
				System.out.println(learningoutcomedelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All LearningOutcomes Data");
				System.out.println("---------------------------------");
				List<ModuleLearningOutcome> learningoutcomes = learningoutcomeData.findAll();
				for (int i=0; i<learningoutcomes.size(); i++) {
					System.out.println(learningoutcomes.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search LearningOutcome");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<ModuleLearningOutcome> learningoutcomesearch = learningoutcomeData.search(search);
				for (int i=0; i<learningoutcomesearch.size(); i++) {
					System.out.println(learningoutcomesearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
