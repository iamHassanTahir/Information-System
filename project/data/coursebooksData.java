package com.uog.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.uog.project.CourseBooks;

public class coursebooksData {
	@SuppressWarnings("resource")
	public static List<CourseBooks> findAll()  {
		List<CourseBooks> books = new ArrayList<CourseBooks>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseBooks.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseBooks book = new CourseBooks();
				
				String[] bookRow = line.split(",");
				
				book.setCOURSEBOOK_ID(Integer.parseInt(bookRow[0]));
				book.setCOURSEBOOK_NAME(bookRow[1]);
				book.setCOURSEBOOK_PRICE(Integer.parseInt(bookRow[2]));
				book.setCOURSEBOOK_QUANTITY(Integer.parseInt(bookRow[3]));
				book.setCOURSEBOOK_CATAGORY(bookRow[4]);
				
				books.add(book);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

	@SuppressWarnings("resource")
	public static CourseBooks findOne(int book_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseBooks.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseBooks book = new CourseBooks();
				
				String[] bookRow = line.split(",");
				
				if (Integer.parseInt(bookRow[0]) == book_ID) {
					book.setCOURSEBOOK_ID(Integer.parseInt(bookRow[0]));
					book.setCOURSEBOOK_NAME(bookRow[1]);
					book.setCOURSEBOOK_PRICE(Integer.parseInt(bookRow[2]));
					book.setCOURSEBOOK_QUANTITY(Integer.parseInt(bookRow[3]));
					book.setCOURSEBOOK_CATAGORY(bookRow[4]);
					
					return book;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static CourseBooks deleteOne(int book_ID)  {
		FileWriter filewriter;

		List<CourseBooks> books = findAll();
		CourseBooks book = findOne(book_ID);

		try {
			filewriter = new FileWriter("CourseBooks.csv");

			for (int i=0; i<books.size(); i++) {
				if (books.get(i).getCOURSEBOOK_ID() != book_ID) {
					filewriter.append(books.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return book;
	}

	@SuppressWarnings("resource")
	public static List<CourseBooks> search(String search)  {
		List<CourseBooks> books = new ArrayList<CourseBooks>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader("CourseBooks.csv"));
			
			while ((line = bufferreader.readLine()) != null) {
				CourseBooks book = new CourseBooks();
				
				String[] bookRow = line.split(",");
				
				if (bookRow[1].contains(search) == true) {
					book.setCOURSEBOOK_ID(Integer.parseInt(bookRow[0]));
					book.setCOURSEBOOK_NAME(bookRow[1]);
					book.setCOURSEBOOK_PRICE(Integer.parseInt(bookRow[2]));
					book.setCOURSEBOOK_QUANTITY(Integer.parseInt(bookRow[3]));
					book.setCOURSEBOOK_CATAGORY(bookRow[4]);
					
					books.add(book);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return books;
	}

	public static CourseBooks Save(CourseBooks book) {
		FileWriter filewriter;

		List<CourseBooks> books = findAll();

		try {
			filewriter = new FileWriter("CourseBooks.csv");

			for (int i=0; i<books.size(); i++) {
				filewriter.append(books.get(i).toString());
				filewriter.append("\n");
			}
			if (books.size()>0)
				book.setCOURSEBOOK_ID(books.get(books.size()-1).getCOURSEBOOK_ID()+1);
			else
				book.setCOURSEBOOK_ID(1);
			filewriter.append(book.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return book;
	}
}