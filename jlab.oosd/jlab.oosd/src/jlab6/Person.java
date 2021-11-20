package jlab6;

public class Person {
	// Variables
	private String name;
	private String address;
	
	// Constructor
	public Person(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public String getAddress() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//toString
	public String toString() {
		return "Student [name: "+name+ ", address: "+address+")";		
	}
}