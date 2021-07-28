package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.model.Department;

public class departmentData {
	@SuppressWarnings("resource")
	public static List<Department> findAll()  {
		List<Department> departments = new ArrayList<Department>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Department.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Department department = new Department();
				
				String[] departmentRow = line.split(",");
				
				department.setDEPARTMENT_ID(Integer.parseInt(departmentRow[0]));
				department.setDEPARTMENT_CODE(departmentRow[1]);
				department.setDEPARTMENT_DESCRIPTION(departmentRow[3]);
				department.setDEPARTMENT_NAME(departmentRow[4]);
				
				departments.add(department);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return departments;
	}

	@SuppressWarnings("resource")
	public static Department findOne(int department_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Department.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Department department = new Department();
				
				String[] departmentRow = line.split(",");
				
				if (Integer.parseInt(departmentRow[0]) == department_ID) {
					department.setDEPARTMENT_ID(Integer.parseInt(departmentRow[0]));
					department.setDEPARTMENT_CODE(departmentRow[1]);
					department.setDEPARTMENT_DESCRIPTION(departmentRow[3]);
					department.setDEPARTMENT_NAME(departmentRow[4]);
					
					return department;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static Department deleteOne(int department_ID)  {
		FileWriter filewriter;

		List<Department> departments = findAll();
		Department department = findOne(department_ID);

		try {
			filewriter = new FileWriter("Department.csv");

			for (int i=0; i<departments.size(); i++) {
				if (departments.get(i).getDEPARTMENT_ID() != department_ID) {
					filewriter.append(departments.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return department;
	}

	@SuppressWarnings("resource")
	public static List<Department> search(String search)  {
		List<Department> departments = new ArrayList<Department>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("Department.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				Department department = new Department();
				
				String[] departmentRow = line.split(",");
				
				if (departmentRow[1].contains(search) == true) {
					department.setDEPARTMENT_ID(Integer.parseInt(departmentRow[0]));
					department.setDEPARTMENT_CODE(departmentRow[1]);
					department.setDEPARTMENT_DESCRIPTION(departmentRow[3]);
					department.setDEPARTMENT_NAME(departmentRow[4]);
					
					departments.add(department);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return departments;
	}

	public static Department Save(Department department) {
		FileWriter filewriter;

		List<Department> departments = findAll();

		try {
			filewriter = new FileWriter("Department.csv");

			for (int i=0; i<departments.size(); i++) {
				filewriter.append(departments.get(i).toString());
				filewriter.append("\n");
			}
			if (departments.size()>0)
				department.setDEPARTMENT_ID(departments.get(departments.size()-1).getDEPARTMENT_ID()+1);
			else
				department.setDEPARTMENT_ID(1);
			filewriter.append(department.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return department;
	}
}