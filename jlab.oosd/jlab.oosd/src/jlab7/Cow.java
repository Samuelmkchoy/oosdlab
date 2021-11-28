package jlab7;

public class Cow extends Animal {

	public Cow(String type, int age, char gender) {
		super(type, age, gender);
	
	}
	
	public String toString() {
		return "Cow " +super.toString();
		
	}
	public void makeSound() {
		System.out.println(super.getType() + " is Moooooing...");
	}
	

}