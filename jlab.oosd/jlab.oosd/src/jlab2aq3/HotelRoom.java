package jlab2aq3;

public class HotelRoom 
{
	private int roomNumber;
	private String roomType;
	private  int occupied;
	private double rate;
	
	public HotelRoom()	
	{
		setRoomNumber(0);
		setRoomType("");
		setOccupied(0);
		setRate(0);
	}
	
	public HotelRoom(int a, String b, int c, double d)	// constructor method #2
	{
		setRoomNumber(a);
		setRoomType(b);
		setOccupied(c);
		setRate(d);
	}
	
	public void setRoomNumber(int num)
	{
		roomNumber = num;
	}
	
	public void setRoomType(String type) 
	{
		roomType = type;
	}
	public void setOccupied(int occ) 
	{
		occupied = occ;
	}
	public void setRate(double ra)
	{
		rate = ra;
	}
	
	public int getRoomNumber() 
	{
		return roomNumber;
	}
	public String getRoomType() 
	{
		return roomType;
	}
	public int getOccupied() 
	{
		return occupied;
	}
	public double getRate() 
	{
		return rate;
	}
}

