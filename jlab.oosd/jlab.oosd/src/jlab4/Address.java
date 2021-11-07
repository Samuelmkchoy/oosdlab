package jlab4;

public class Address {

	private String street;
	private String town;
	private String county;
	
	public String getCounty() 
	{
		return county;
	}
	
	public void setCounty(String employeecounty) 
	{
		this.county = employeecounty;
	}
	
	public String getTown() 
	{
		return town;
	}
	
	public void setTown(String employeetown) 
	{
		this.town = employeetown;
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String employeestreet) 
	{
		this.street = employeestreet;
	}
	
	public String toString()
	{
		return "\n" + getStreet() + "\n" + getTown() + "\n" + getCounty();		
	}
}