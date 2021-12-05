package jlab8q1;

public class Sphere extends ThreeDShape
{
	private double radius;
	
	
	public Sphere(String name, String colour, double radius) 
	{
		super(name, colour);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	public double area() 
	{
		return 3.14*radius*radius;
	}
	public double volume()
	{
		return (4/3)*3.14*(radius*radius*radius);
	}

}
