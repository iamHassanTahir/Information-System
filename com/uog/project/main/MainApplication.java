import java.util.List;
import java.util.Scanner;

import com.uog.project.data.roomData;
import com.uog.project.model.Room;

public class MainApplication {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int choice=-1;

	choice = -1;
	while (choice!=23) {
		System.out.println("=====================================================");
		System.out.println("Main Menu");
		System.out.println("=====================================================");
		System.out.println(" 1.    Building");
		System.out.println(" 2.    Calendar");
		System.out.println(" 3.    Campus");
		System.out.println(" 4.    College");
		System.out.println(" 5.    Course Books");
		System.out.println(" 6.    Course Data");
		System.out.println(" 7.    Course Module");
		System.out.println(" 8.    Course Subject");
		System.out.println(" 9.    Department");
		System.out.println("10.    Intake Course");
		System.out.println("11.    Intake");
		System.out.println("12.    Module Learning Outcome");
		System.out.println("13.    Lookup");
		System.out.println("14.    Module Assessment");
		System.out.println("15.    Module");
		System.out.println("16.    Qualification");
		System.out.println("17.    Rooms");
		System.out.println("18.    Semester");
		System.out.println("19.    TimeSlot");
		System.out.println("20.    University Courses");
		System.out.println("21.    University");
		System.out.println("22.    Academics Year");
		System.out.println("23.   Back");
		System.out.print("Enter Your Choice [1-23]: ");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("---------------------------------");
			System.out.println("Add New Room");
			System.out.println("---------------------------------");
			Room room = new Room();
			
			System.out.println("Enter Room Name: ");
			String name = scan.nextLine();
			name+=scan.nextLine();
			room.setROOM_NAME(name);

			System.out.println("Enter Room Floor: ");
			int floor = scan.nextInt();
			room.setROOM_FLOOR(floor);

			System.out.println("Enter Room Capacity: ");
			int capacity = scan.nextInt();
			room.setROOM_CAPACITY(capacity);

			System.out.println("Enter Room Code: ");
			String code = scan.nextLine();
			code+=scan.nextLine();
			room.setROOM_CODE(code);

			room = roomData.Save(room);
			System.out.println(room.toString());
			System.out.println("---------------------------------");
			break;
		case 2:
			System.out.println("---------------------------------");
			System.out.println("Delete Room");
			System.out.println("---------------------------------");
			System.out.println("Enter Room ID: ");
			int room_ID = scan.nextInt();
			
			Room roomdelete = roomData.deleteOne(room_ID);
			System.out.println(roomdelete.toString());
			System.out.println("---------------------------------");
			break;
		case 3:
			System.out.println("---------------------------------");
			System.out.println("Show All Rooms Data");
			System.out.println("---------------------------------");
			List<Room> rooms = roomData.findAll();
			for (int i=0; i<rooms.size(); i++) {
				System.out.println(rooms.get(i).toString());
			}
			System.out.println("---------------------------------");
			break;
		case 4:
			System.out.println("---------------------------------");
			System.out.println("Search Room");
			System.out.println("---------------------------------");
			System.out.println("Enter search: ");
			String search = scan.nextLine();
			search+=scan.nextLine();
			List<Room> roomsearch = roomData.search(search);
			for (int i=0; i<roomsearch.size(); i++) {
				System.out.println(roomsearch.get(i).toString());
			}
			System.out.println("---------------------------------");
			
			break;
		case 10:
			break;
		}
	}
}
}
