package com.uog.project.menu;

import java.util.List;
import java.util.Scanner;

import com.uog.project.data.moduleassesData;
import com.uog.project.model.ModuleAssessmentCriteria;

public class moduleassesInterface {
	public static void ModuleAssessmentCriteriaMenu() {
		Scanner scan = new Scanner(System.in);
		int choice=-1;

		choice = -1;
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("ModuleAssessmentCriterias Menu");
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
				System.out.println("Add New ModuleAssessmentCriteria");
				System.out.println("---------------------------------");
				ModuleAssessmentCriteria criteria = new ModuleAssessmentCriteria();
				
				System.out.println("Enter ModuleAssessmentCriteria ID: ");
				int id = scan.nextInt();
				criteria.setASSESSMENTCRITERIA_ID(id);

				System.out.println("Enter ModuleAssessmentCriteria Code: ");
				String code = scan.nextLine();
				code+=scan.nextLine();
				criteria.setASSESSMENTCRITERIA_CODE(code);
				
				System.out.println("Enter ModuleAssessmentCriteria No: ");
				int no = scan.nextInt();
				criteria.setASSESSMENTCRITERIA_NO(no);

				System.out.println("Enter ModuleAssessmentCriteria Description: ");
				String desc = scan.nextLine();
				desc+=scan.nextLine();
				criteria.setASSESSMENTCRITERIA_DESC(desc);

				criteria = moduleassesData.Save(criteria);
				System.out.println(criteria.toString());
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete ModuleAssessmentCriteria");
				System.out.println("---------------------------------");
				System.out.println("Enter ModuleAssessmentCriteria ID: ");
				int criteria_ID = scan.nextInt();
				
				ModuleAssessmentCriteria criteriadelete = moduleassesData.deleteOne(criteria_ID);
				System.out.println(criteriadelete.toString());
				System.out.println("---------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Show All ModuleAssessmentCriterias Data");
				System.out.println("---------------------------------");
				List<ModuleAssessmentCriteria> criterias = moduleassesData.findAll();
				for (int i=0; i<criterias.size(); i++) {
					System.out.println(criterias.get(i).toString());
				}
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Search ModuleAssessmentCriteria");
				System.out.println("---------------------------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<ModuleAssessmentCriteria> criteriasearch = moduleassesData.search(search);
				for (int i=0; i<criteriasearch.size(); i++) {
					System.out.println(criteriasearch.get(i).toString());
				}
				System.out.println("---------------------------------");
				
				break;
			case 10:
				break;
			}
		}
	}
}
