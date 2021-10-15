package jlab2aq1;

public class HotelRoom 
{
	private int roomNumber;
	private String roomType;
	public HotelRoom()	
	{
		setRoomNumber(0);
		setRoomType("");
	}
	
	public void setRoomNumber(int num)
	{
		roomNumber = num;
	}
	
	public void setRoomType(String type) 
	{
		roomType = type;
	}
	
	
	public int getRoomNumber() 
	{
		return roomNumber;
	}
	public String getRoomType() 
	{
		return roomType;
	}
	
}

