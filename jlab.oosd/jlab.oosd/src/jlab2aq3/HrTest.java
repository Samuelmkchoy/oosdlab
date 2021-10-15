package jlab2aq3;

public class HrTest {
	
	public static void main(String args[]) 
	{

		HotelRoom roomA = new HotelRoom();		
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202,"Single",0,90);

		
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
		
		System.out.println("roomC (room number is " + roomC.getRoomNumber() + ", type is " + roomC.getRoomType() + ", occupied is "+ roomC.getOccupied() + ", rate is "+ roomC.getRate()+ ".)");

	}
}
