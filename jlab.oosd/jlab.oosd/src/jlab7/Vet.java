package jlab7;

public class Vet {
	
	//Variables
	private String name;
	
	//Constructor
	public Vet(String name) {
		this.name = name;
	}

	public void vaccinate(Animal animal) {
		System.out.println(name + " is vaccinating...");
		if (animal instanceof Dog)
		{
			System.out.println("Dog has been vaccinated " + animal);
		}
		else if (animal instanceof Cat)
		{
			System.out.println("Cat has been vaccinated " + animal);
		}
		else
		{
			System.out.println("Only cats and dogs can be vaccinated");
		}
			
		
	}
}