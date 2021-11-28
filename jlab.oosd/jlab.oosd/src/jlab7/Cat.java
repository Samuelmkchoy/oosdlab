package jlab7;

public class Cat extends Animal{

	public Cat(String type, int age, char gender) {
		super(type, age, gender);
		
	}

	@Override
	public String toString() {
		return "Cat " +super.toString();
		
	}
	public void makeSound() {
		System.out.println(super.getType() + " is Maaaeeeeeee...");
	}
}
