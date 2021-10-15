package jlab2bq1;

public class Rectangle 
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		setLength(1);
		setWidth(1);
		
	}
	
	public void setLength(double len) 
	{
		if(len > 0.0 && len <= 40.0)
		{
			length = len;
		}
	}
	public void setWidth(double wid) 
	{
		if(wid > 0.0 && wid <= 40.0)
		{
			width = wid;
		}
	}
	
	public double getLength() 
	{
		return length;
	}
	public double getWidth() 
	{
		return width;
	}
	//public void toString()
    //{
    //  System.out.print("Length = " +  getLength() + ", Width = " + getWidth());
    //}
	//
}
