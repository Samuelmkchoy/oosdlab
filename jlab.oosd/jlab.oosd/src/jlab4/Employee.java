package jlab4;

public class Employee {

	private static int employeeRecordCount = 0;
	private int employeeNumber;
	private Address address;
	private String type;
	private String car = "";
	
	public Employee()
	{
		setEmployeeNumber(employeeRecordCount);
		employeeRecordCount++;
	}
	
	
	public void setEmployeeNumber(int employeeNumber)
	{
		this.employeeNumber = 1000 + employeeNumber;
	}
	
	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public void setType(String type) 
	{
		this.type = type;
	}
	
	public void setCar(String car) {
		
		if(getType() != "Manager")
		{
			System.out.println("Only Managers may have company cars");
			return;
		}
		this.car = car;
	}

	public int getEmployeeRecordCount()
	{
		return employeeRecordCount;
	}
	
	public int getEmployeeNumber()
	{
		return employeeNumber;
	}
	


	public Address getAddress() 
	{
		return address;
	}

	
	public String getType() {
		return type;
	}

	
	public String getCar() {
		
		if(getType() != "Manager")
		{
			System.out.println("Only Managers have company cars.");
		}
		return car;
	}

	
	
	public String toString()
	{
		String strEmployee = "";
		strEmployee = "\nEmployee Number" + getEmployeeNumber() + "\nType" + getType() + "\nAddress" + getAddress();
		if(getType() == "Manager")
		{
			strEmployee += "\nCompany Car: " + car;
		}
		return strEmployee;
	}
	
}