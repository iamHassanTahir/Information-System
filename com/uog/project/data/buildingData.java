package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.Building;

public class buildingData {
	@SuppressWarnings("resource")
	public static List<Building> findAll()  {
		List<Building> buildings = new ArrayList<Building>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Building.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Building building = new Building();
				
				String[] buildingRow = line.split(",");
				
				building.setBUILDING_ID(Integer.parseInt(buildingRow[0]));
				building.setBUILDING_CODE(buildingRow[1]);
				building.setBUILDING_NAME(buildingRow[2]);
				
				buildings.add(building);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return buildings;
	}

	@SuppressWarnings("resource")
	public static Building findOne(int building_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Building.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Building building = new Building();
				
				String[] buildingRow = line.split(",");
				
				if (Integer.parseInt(buildingRow[0]) == building_ID) {
					building.setBUILDING_ID(Integer.parseInt(buildingRow[0]));
					building.setBUILDING_CODE(buildingRow[1]);
					building.setBUILDING_NAME(buildingRow[2]);
					
					return building;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static Building deleteOne(int building_ID)  {
		FileWriter filewriter;

		List<Building> buildings = findAll();
		Building building = findOne(building_ID);

		try {
			filewriter = new FileWriter("Building.csv");

			for (int i=0; i<buildings.size(); i++) {
				if (buildings.get(i).getBUILDING_ID() != building_ID) {
					filewriter.append(buildings.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return building;
	}

	@SuppressWarnings("resource")
	public static List<Building> search(String search)  {
		List<Building> buildings = new ArrayList<Building>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Building.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Building building = new Building();
				
				String[] buildingRow = line.split(",");
				
				if (buildingRow[1].contains(search) == true) {
					building.setBUILDING_ID(Integer.parseInt(buildingRow[0]));
					building.setBUILDING_CODE(buildingRow[1]);
					building.setBUILDING_NAME(buildingRow[2]);
					
					buildings.add(building);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return buildings;
	}

	public static Building Save(Building building) {
		FileWriter filewriter;

		List<Building> buildings = findAll();

		try {
			filewriter = new FileWriter("Building.csv");

			for (int i=0; i<buildings.size(); i++) {
				filewriter.append(buildings.get(i).toString());
				filewriter.append("\n");
			}
			if (buildings.size()>0)
				building.setBUILDING_ID(buildings.get(buildings.size()-1).getBUILDING_ID()+1);
			else
				building.setBUILDING_ID(1);
			filewriter.append(building.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return building;
	}
}
