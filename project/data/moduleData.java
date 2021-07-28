package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.Module;

public class moduleData {

	@SuppressWarnings("resource")
	public static List<Module> findAll()  {
		List<Module> modules = new ArrayList<Module>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Module.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Module module = new Module();
				
				String[] moduleRow = line.split(",");
				
				module.setMODULE_ID(Integer.parseInt(moduleRow[0]));
				module.setMODULE_CODE(moduleRow[1]);
				module.setMODULE_INTRODUCTION(moduleRow[1]);
				module.setMODULE_TITLE(moduleRow[0]);
				module.setGUIDEDLEARNING_HOURS(Integer.parseInt(moduleRow[1]));
				module.setMODULE_NO(Integer.parseInt(moduleRow[2]));
				module.setMODULE_LEVEL(Integer.parseInt(moduleRow[3]));
				module.setCREDIT_HOURS(Integer.parseInt(moduleRow[4]));
				
				modules.add(module);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return modules;
	}

	@SuppressWarnings("resource")
	public static Module findOne(int module_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Module.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Module module = new Module();
				
				String[] moduleRow = line.split(",");
				
				if (Integer.parseInt(moduleRow[0]) == module_ID) {
					module.setMODULE_ID(Integer.parseInt(moduleRow[0]));
					module.setMODULE_CODE(moduleRow[1]);
					module.setMODULE_INTRODUCTION(moduleRow[1]);
					module.setMODULE_TITLE(moduleRow[0]);
					module.setGUIDEDLEARNING_HOURS(Integer.parseInt(moduleRow[1]));
					module.setMODULE_NO(Integer.parseInt(moduleRow[2]));
					module.setMODULE_LEVEL(Integer.parseInt(moduleRow[3]));
					module.setCREDIT_HOURS(Integer.parseInt(moduleRow[4]));
					
					return module;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static Module deleteOne(int module_ID)  {
		FileWriter filewriter;

		List<Module> modules = findAll();
		Module room = findOne(module_ID);

		try {
			filewriter = new FileWriter("Module.csv");

			for (int i=0; i<modules.size(); i++) {
				if (modules.get(i).getMODULE_ID() != module_ID) {
					filewriter.append(modules.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return room;
	}

	@SuppressWarnings("resource")
	public static List<Module> search(String search)  {
		List<Module> modules = new ArrayList<Module>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Module.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Module module = new Module();
				
				String[] moduleRow = line.split(",");
				
				if (moduleRow[1].contains(search) == true) {
					module.setMODULE_ID(Integer.parseInt(moduleRow[0]));
					module.setMODULE_CODE(moduleRow[1]);
					module.setMODULE_INTRODUCTION(moduleRow[1]);
					module.setMODULE_TITLE(moduleRow[0]);
					module.setGUIDEDLEARNING_HOURS(Integer.parseInt(moduleRow[1]));
					module.setMODULE_NO(Integer.parseInt(moduleRow[2]));
					module.setMODULE_LEVEL(Integer.parseInt(moduleRow[3]));
					module.setCREDIT_HOURS(Integer.parseInt(moduleRow[4]));
					
					modules.add(module);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return modules;
	}

	public static Module Save(Module module) {
		FileWriter filewriter;

		List<Module> modules = findAll();

		try {
			filewriter = new FileWriter("Module.csv");

			for (int i=0; i<modules.size(); i++) {
				filewriter.append(modules.get(i).toString());
				filewriter.append("\n");
			}
			if (modules.size()>0)
				module.setMODULE_ID(modules.get(modules.size()-1).getMODULE_ID()+1);
			else
				module.setMODULE_ID(1);
			filewriter.append(module.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return module;
	}
}
