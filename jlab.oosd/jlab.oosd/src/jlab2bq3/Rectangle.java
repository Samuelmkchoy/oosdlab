package jlab2bq3;

public class Rectangle 
{
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private String star="";
	private String space="";

	
	public Rectangle()
	{
		setLength(1);
		setWidth(1);
		setArea(1);
		setPerimeter(1);
		
		
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
	public void setArea(double ay)
	{
		area = ay;
	}
	public void setPerimeter(double pr)
	{
		perimeter = pr;
	}
	
	public double getLength() 
	{
		return length;
	}
	public double getWidth() 
	{
		return width;
	}
	public double getArea() 
	{
		area = length*width;
		return area;
	}
	public double getPerimeter() 
	{
		perimeter= (length+width)*2;
		return perimeter;
	}
	
	public void printRectangle()
	{
		for(int index = 0; index< getWidth(); index++)
		{
			star += "*";
		}
		System.out.println(star);
		for(int index = 0; index< getWidth()-2; index++)
		{
			space += " ";
		}
		for (int index = 0; index < getLength() - 2; index++)
        {
          System.out.println("*" + space + "*");
        }
      System.out.println(star);
	}
	
	//public void toString()
    //{
    //  System.out.print("Length = " +  getLength() + ", Width = " + getWidth());
    //}
	//

}
