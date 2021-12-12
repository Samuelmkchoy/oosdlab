package jlab9q2;

public class RoadVehicle {
	private int wheels;
	private int passengers;
	private float price;
	
	public RoadVehicle() {
		this(0,0,0);
	}
	
	public RoadVehicle(int wheel, int passenager, float price) {
		setWheels(wheel);
		setPassengers(passenager);
		setPrice(price);	
	}
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
