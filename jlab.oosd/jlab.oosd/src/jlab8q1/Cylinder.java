package jlab8q1;

public class Cylinder extends ThreeDShape
{
	private double radius;
	private double height;
	public Cylinder(String name, String colour, double radius, double height) 
	{
		super(name, colour);
		this.radius = radius;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	public double area()
	{
		return 2*(3.14*radius*height)+2*(3.14*(radius*radius));
	}
	
	public double volume() 
	{
		return 3.14*(radius*radius)*height;
	}
}
