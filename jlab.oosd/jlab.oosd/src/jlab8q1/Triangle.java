package jlab8q1;

public class Triangle extends TwoDShape
{
	private double base;
	private double height;
	public Triangle(String name, String colour, double base, double height) 
	{
		super(name, colour);
		this.base = base;
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	
	public double area()
	{
		return (base*height)/2;
	}

}
