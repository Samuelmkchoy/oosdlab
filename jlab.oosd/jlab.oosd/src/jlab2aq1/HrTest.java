package jlab2aq1;

public class HrTest {
	
	public static void main(String args[]) 
	{

		HotelRoom roomA = new HotelRoom();		// Create an instance of our Thermometer class
		HotelRoom roomB = new HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		
		System.out.println("roomA (room number is " + roomA.getRoomNumber() + ", type is " + roomA.getRoomType() +")");
		
		
		System.out.println("roomB (room number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() +")");
		
	}
}
