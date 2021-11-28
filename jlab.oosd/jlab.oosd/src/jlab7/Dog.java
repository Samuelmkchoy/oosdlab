package jlab7;

public class Dog extends Animal{
	
	public Dog(String type, int age, char gender) {
		super(type, age, gender);
	}
	
	public String toString() {
		return "Dog " +super.toString();
	}
	public void makeSound() {
		System.out.println(super.getType() + " is barking...");
	}
}
