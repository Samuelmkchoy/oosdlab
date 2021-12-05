package jlab8q1;

public class Circle extends TwoDShape
{
	private double radius;
	
	public Circle(String name, String colour, double radius) 
	{
		super(name, colour);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	public double area() 
	{
		return 3.14*radius*radius;
	}
}
