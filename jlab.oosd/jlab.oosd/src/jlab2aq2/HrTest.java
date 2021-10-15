package jlab2aq2;

public class HrTest {
	
	public static void main(String args[]) 
	{

		HotelRoom roomA = new HotelRoom();		// Create an instance of our Thermometer class
		HotelRoom roomB = new HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setOccupied(1);
		roomA.setRate(100);
		
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		System.out.println("roomA (room number is " + roomA.getRoomNumber() + ", type is " + roomA.getRoomType()  +", occupied is "+ roomA.getOccupied() + ", rate is "+ roomA.getRate()+ ".)");
		
		
		System.out.println("roomB (room number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() + ", occupied is "+ roomB.getOccupied() + ", rate is "+ roomB.getRate()+ ".)");
		
	}
}

//roomC.setRoomNumber(202);
//roomC.setRoomType("Single");
//roomC.setOccupied(0);
//roomC.setRate(90);