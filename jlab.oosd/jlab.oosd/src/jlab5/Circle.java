package jlab5;

//Author : Ming Kit Choy
//Date : Nov-2021	
//Purpose : A test driver program for our
	//: Point/Circle inheritance
public class Circle extends Point
{
	//Variables
	private double radius;
	
	//Constructor
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	//toString
	public String toString() {
		return "Circle [x=" + x + ", y=" + y +", radius=" + radius + "]";
	}
	
	
}
