package jlab2aq4;

public class HotelRoom 
{
	private int roomNumber;
	private String roomType;
	private  boolean occupied;
	private double rate;
	
	
	public HotelRoom()	
	{
		setRoomNumber(0);
		setRoomType("");
		setOccupied(false);
		setRate(0);
	}
	public HotelRoom(int a, String b, boolean c, double d)	// constructor method #2
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
	public void setOccupied(boolean occ) 
	{
		if (isOccupied() == false)
		{
			occupied = occ;
		}
		
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
	public boolean getOccupied() 
	{
		return occupied;
	}
	public double getRate() 
	{
		return rate;
	}
	
	public boolean isOccupied()
	{
		if (occupied == true) 
		{
			return true;
		}
		else if (occupied == false)
		{
			return false;
		}
		return false;
	}
}

