package jlab1q1;

//Student Name 	: Ming Kit Choy
//Student Id Number: C00246492
//Date 			: Oct_2021
//Purpose 			: lab1q1

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10);
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
	} // end main
} // end class ThermTest