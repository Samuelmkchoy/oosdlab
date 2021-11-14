package jlab5;

//Author : Ming Kit Choy
//Date : Nov-2021	
//Purpose : A test driver program for our
	//: Point/Circle inheritance
public class Point 
{
	//Variables
	protected int x;
	protected int y;
	
	//Constructor
	public Point(int x, int y) 
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	//Getter and Setter
	protected int getX() {
		return x;
	}
	protected void setX(int x) {
		this.x = x;
	}
	protected int getY() {
		return y;
	}
	protected void setY(int y) {
		this.y = y;
	}

	
	//toString
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
