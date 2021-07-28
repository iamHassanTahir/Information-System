package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.ModuleLearningOutcome;

public class learningoutcomeData {

	@SuppressWarnings("resource")
	public static List<ModuleLearningOutcome> findAll()  {
		List<ModuleLearningOutcome> learningoutcomes = new ArrayList<ModuleLearningOutcome>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("ModuleLearningOutcome.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				ModuleLearningOutcome learningoutcome = new ModuleLearningOutcome();
				
				String[] learningoutcomeRow = line.split(",");
				
				learningoutcome.setLEARNINGOUTCOME_ID(Integer.parseInt(learningoutcomeRow[0]));
				learningoutcome.setLEARNINGOUTCOME_CODE(learningoutcomeRow[1]);
				learningoutcome.setLEARNINGOUTCOME_NO(Integer.parseInt(learningoutcomeRow[2]));
				learningoutcome.setLEARNINGOUTCOME_DESC(learningoutcomeRow[3]);
				learningoutcome.setLEARNINGOUTCOME_INTRODUCTION(learningoutcomeRow[4]);
				learningoutcome.setLEARNINGOUTCOME_CONTENTLINK(learningoutcomeRow[5]);
				
				learningoutcomes.add(learningoutcome);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return learningoutcomes;
	}

	@SuppressWarnings("resource")
	public static ModuleLearningOutcome findOne(int learningoutcome_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("ModuleLearningOutcome.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				ModuleLearningOutcome learningoutcome = new ModuleLearningOutcome();
				
				String[] learningoutcomeRow = line.split(",");
				
				if (Integer.parseInt(learningoutcomeRow[0]) == learningoutcome_ID) {
					learningoutcome.setLEARNINGOUTCOME_ID(Integer.parseInt(learningoutcomeRow[0]));
					learningoutcome.setLEARNINGOUTCOME_CODE(learningoutcomeRow[1]);
					learningoutcome.setLEARNINGOUTCOME_NO(Integer.parseInt(learningoutcomeRow[2]));
					learningoutcome.setLEARNINGOUTCOME_DESC(learningoutcomeRow[3]);
					learningoutcome.setLEARNINGOUTCOME_INTRODUCTION(learningoutcomeRow[4]);
					learningoutcome.setLEARNINGOUTCOME_CONTENTLINK(learningoutcomeRow[5]);
					
					return learningoutcome;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static ModuleLearningOutcome deleteOne(int learningoutcome_ID)  {
		FileWriter filewriter;

		List<ModuleLearningOutcome> learningoutcomes = findAll();
		ModuleLearningOutcome learningoutcome = findOne(learningoutcome_ID);

		try {
			filewriter = new FileWriter("ModuleLearningOutcome.csv");

			for (int i=0; i<learningoutcomes.size(); i++) {
				if (learningoutcomes.get(i).getLEARNINGOUTCOME_ID() != learningoutcome_ID) {
					filewriter.append(learningoutcomes.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return learningoutcome;
	}

	@SuppressWarnings("resource")
	public static List<ModuleLearningOutcome> search(String search)  {
		List<ModuleLearningOutcome> learningoutcomes = new ArrayList<ModuleLearningOutcome>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("ModuleLearningOutcome.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				ModuleLearningOutcome learningoutcome = new ModuleLearningOutcome();
				
				String[] learningoutcomeRow = line.split(",");
				
				if (learningoutcomeRow[1].contains(search) == true) {
					learningoutcome.setLEARNINGOUTCOME_ID(Integer.parseInt(learningoutcomeRow[0]));
					learningoutcome.setLEARNINGOUTCOME_CODE(learningoutcomeRow[1]);
					learningoutcome.setLEARNINGOUTCOME_NO(Integer.parseInt(learningoutcomeRow[2]));
					learningoutcome.setLEARNINGOUTCOME_DESC(learningoutcomeRow[3]);
					learningoutcome.setLEARNINGOUTCOME_INTRODUCTION(learningoutcomeRow[4]);
					learningoutcome.setLEARNINGOUTCOME_CONTENTLINK(learningoutcomeRow[5]);
					
					learningoutcomes.add(learningoutcome);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return learningoutcomes;
	}

	public static ModuleLearningOutcome Save(ModuleLearningOutcome learningoutcome) {
		FileWriter filewriter;

		List<ModuleLearningOutcome> learningoutcomes = findAll();

		try {
			filewriter = new FileWriter("ModuleLearningOutcome.csv");

			for (int i=0; i<learningoutcomes.size(); i++) {
				filewriter.append(learningoutcomes.get(i).toString());
				filewriter.append("\n");
			}
			if (learningoutcomes.size()>0)
				learningoutcome.setLEARNINGOUTCOME_ID(learningoutcomes.get(learningoutcomes.size()-1).getLEARNINGOUTCOME_ID()+1);
			else
				learningoutcome.setLEARNINGOUTCOME_ID(1);
			filewriter.append(learningoutcome.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return learningoutcome;
	}
}
