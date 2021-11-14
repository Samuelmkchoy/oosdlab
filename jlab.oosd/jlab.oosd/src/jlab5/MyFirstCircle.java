package jlab5;

//Author : Ming Kit Choy
//Date : Nov-2021	
//Purpose : A test driver program for our
	//: Point/Circle inheritance
public class MyFirstCircle
	{
		public static void main (String args[])
		{
			Point myPoint = new Point(10, 20);
			Circle myCircle = new Circle(15, 30, 5);
			System.out.println("Point details : " +myPoint);
			System.out.println("Circle details: " +myCircle);
		}
	}