package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.ModuleAssessmentCriteria;

public class moduleassesData {

	@SuppressWarnings("resource")
	public static List<ModuleAssessmentCriteria> findAll()  {
		List<ModuleAssessmentCriteria> criterias = new ArrayList<ModuleAssessmentCriteria>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("ModuleAssessmentCriteria.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				ModuleAssessmentCriteria criteria = new ModuleAssessmentCriteria();
				
				String[] criteriaRow = line.split(",");
				
				criteria.setASSESSMENTCRITERIA_ID(Integer.parseInt(criteriaRow[0]));
				criteria.setASSESSMENTCRITERIA_CODE(criteriaRow[1]);
				criteria.setASSESSMENTCRITERIA_NO(Integer.parseInt(criteriaRow[2]));
				criteria.setASSESSMENTCRITERIA_DESC(criteriaRow[4]);
				
				criterias.add(criteria);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return criterias;
	}

	@SuppressWarnings("resource")
	public static ModuleAssessmentCriteria findOne(int criteria_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("ModuleAssessmentCriteria.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				ModuleAssessmentCriteria criteria = new ModuleAssessmentCriteria();
				
				String[] criteriaRow = line.split(",");
				
				if (Integer.parseInt(criteriaRow[0]) == criteria_ID) {
					criteria.setASSESSMENTCRITERIA_ID(Integer.parseInt(criteriaRow[0]));
					criteria.setASSESSMENTCRITERIA_CODE(criteriaRow[1]);
					criteria.setASSESSMENTCRITERIA_NO(Integer.parseInt(criteriaRow[2]));
					criteria.setASSESSMENTCRITERIA_DESC(criteriaRow[4]);
					
					return criteria;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static ModuleAssessmentCriteria deleteOne(int criteria_ID)  {
		FileWriter filewriter;

		List<ModuleAssessmentCriteria> criterias = findAll();
		ModuleAssessmentCriteria criteria = findOne(criteria_ID);

		try {
			filewriter = new FileWriter("ModuleAssessmentCriteria.csv");

			for (int i=0; i<criterias.size(); i++) {
				if (criterias.get(i).getASSESSMENTCRITERIA_ID() != criteria_ID) {
					filewriter.append(criterias.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return criteria;
	}

	@SuppressWarnings("resource")
	public static List<ModuleAssessmentCriteria> search(String search)  {
		List<ModuleAssessmentCriteria> criterias = new ArrayList<ModuleAssessmentCriteria>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("ModuleAssessmentCriteria.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				ModuleAssessmentCriteria criteria = new ModuleAssessmentCriteria();
				
				String[] criteriaRow = line.split(",");
				
				if (criteriaRow[1].contains(search) == true) {
					criteria.setASSESSMENTCRITERIA_ID(Integer.parseInt(criteriaRow[0]));
					criteria.setASSESSMENTCRITERIA_CODE(criteriaRow[1]);
					criteria.setASSESSMENTCRITERIA_NO(Integer.parseInt(criteriaRow[2]));
					criteria.setASSESSMENTCRITERIA_DESC(criteriaRow[4]);
					
					criterias.add(criteria);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return criterias;
	}

	public static ModuleAssessmentCriteria Save(ModuleAssessmentCriteria criteria) {
		FileWriter filewriter;

		List<ModuleAssessmentCriteria> criterias = findAll();

		try {
			filewriter = new FileWriter("ModuleAssessmentCriteria.csv");

			for (int i=0; i<criterias.size(); i++) {
				filewriter.append(criterias.get(i).toString());
				filewriter.append("\n");
			}
			if (criterias.size()>0)
				criteria.setASSESSMENTCRITERIA_ID(criterias.get(criterias.size()-1).getASSESSMENTCRITERIA_ID()+1);
			else
				criteria.setASSESSMENTCRITERIA_ID(1);
			filewriter.append(criteria.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return criteria;
	}
}
