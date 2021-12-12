package jlab9q2;

public class Car extends RoadVehicle implements ImportDuty
{
    private String carType;
 
    public Car() 
    {
    	this("", 0, 0, 0);
    }
 
    public Car(String c, int w, int p, float price) 
    { 
        super(w, p, price);
        setType(c);
    }
 
    public void setType(String t)  
    {
        carType = t;
    }
 
    public String getType() 
    {
        return carType;
    }

    public double calculateDuty() 
    {
        return CarTaxRate * getPrice();
    }
}