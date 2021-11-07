package jlab4;

public class MyHr {
	
	public static void main(String[] args){

        Employee[] employees = new Employee[5];
	    Office[] offices = new Office[3];
	    
	    
	    employees[1].setAddress(null);
	    employees[2].setAddress(null);
	    employees[3].setAddress(null);
	    employees[4].setAddress(null);
	    employees[5].setAddress(null);
	    
	    employees[1].setType("Manage");
	    employees[2].setType("Manage");
	    employees[3].setType("Staff");
	    employees[4].setType("Staff");
	    employees[5].setType("Staff");
	    
	    offices[1].SetRoomNumber(0);
	    offices[2].SetRoomNumber(1);
	    offices[3].SetRoomNumber(2);

	    for(int i = 0; i < employees.length; i++)
		{
	    	System.out.println("Employee Number: " + employees[i].getEmployeeNumber() + "Address: " + employees[i].getAddress());
		}
	    
	    for(int i = 0; i < offices.length; i++)
		{
			System.out.println("Office Number: "+ offices[i]);
		}
		
	    

	}
}