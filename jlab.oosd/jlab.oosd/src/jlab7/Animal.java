package jlab7;

public class Animal 
{
	//Variables
	private String type;
	private int age;
	private char gender;
	
	// Constructor
	public Animal(String type, int age, char gender) {
		super();
		setType(type);
		setAge(age);
		setGender(gender);
	}
	//Getters & Setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//Method
	public void eat() 
	{
		System.out.println(type + " is eating...");
	}
	public void sleep() 
	{
		System.out.println(type + " is sleeping...");
	}
	
	public void makeSound() {
		System.out.println(type + " is making a sound...");
	}
	//toString
	public String toString() {
		return " [Type= " + type + ", Age= " + age + ", Gender= " + gender + "]";
	}
	
}
