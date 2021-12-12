package jlab9q2;

public class Hgv extends RoadVehicle implements ImportDuty
{
	private int cargo;
	
	public Hgv() 
	{
		this(0,0,0,0);
	}
	
	public Hgv(int car, int wheel, int passenager, int price) 
	{
		super(wheel, passenager, price);
		setCargo(car);
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	
	public double calculateDuty() 
	{
		return HgvTaxRate * getPrice();
		
	}
}
