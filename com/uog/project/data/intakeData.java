package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.Intake;

public class intakeData {
	@SuppressWarnings("resource")
	public static List<Intake> findAll()  {
		List<Intake> intakes = new ArrayList<Intake>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Intake.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Intake intake = new Intake();
				
				String[] intakeRow = line.split(",");
				
				intake.setINTAKE_ID(Integer.parseInt(intakeRow[0]));
				intake.setINTAKE_DESC(intakeRow[1]);
				intake.setISADMISSIONOPEN(intakeRow[4]);
				
				intakes.add(intake);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intakes;
	}

	@SuppressWarnings("resource")
	public static Intake findOne(int intake_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Intake.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Intake intake = new Intake();
				
				String[] intakeRow = line.split(",");
				
				if (Integer.parseInt(intakeRow[0]) == intake_ID) {
					intake.setINTAKE_ID(Integer.parseInt(intakeRow[0]));
					intake.setINTAKE_DESC(intakeRow[1]);
					intake.setISADMISSIONOPEN(intakeRow[4]);
					
					return intake;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static Intake deleteOne(int intake_ID)  {
		FileWriter filewriter;

		List<Intake> intakes = findAll();
		Intake intake = findOne(intake_ID);

		try {
			filewriter = new FileWriter("Intake.csv");

			for (int i=0; i<intakes.size(); i++) {
				if (intakes.get(i).getINTAKE_ID() != intake_ID) {
					filewriter.append(intakes.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intake;
	}

	@SuppressWarnings("resource")
	public static List<Intake> search(String search)  {
		List<Intake> intakes = new ArrayList<Intake>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Intake.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Intake intake = new Intake();
				
				String[] intakeRow = line.split(",");
				
				if (intakeRow[1].contains(search) == true) {
					intake.setINTAKE_ID(Integer.parseInt(intakeRow[0]));
					intake.setINTAKE_DESC(intakeRow[1]);
					intake.setISADMISSIONOPEN(intakeRow[4]);
					
					intakes.add(intake);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return intakes;
	}

	public static Intake Save(Intake intake) {
		FileWriter filewriter;

		List<Intake> intakes = findAll();

		try {
			filewriter = new FileWriter("Intake.csv");

			for (int i=0; i<intakes.size(); i++) {
				filewriter.append(intakes.get(i).toString());
				filewriter.append("\n");
			}
			if (intakes.size()>0)
				intake.setINTAKE_ID(intakes.get(intakes.size()-1).getINTAKE_ID()+1);
			else
				intake.setINTAKE_ID(1);
			filewriter.append(intake.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return intake;
	}
}