package jlab4;

public class Office {

    private static int roomCount = 0;
	private int roomNumber;
	private Employee[] assignedEmployees = new Employee[2];

    public Office (){
        SetRoomNumber(roomCount);
        roomCount++;
    }

    public void SetRoomNumber(int roomNumber){
        this.roomNumber=100+roomCount;
    }

    public int GetRoomNumber(){
        return roomNumber;
    }


    public void addEmployeeToOffice(Employee employee)
	{
		if(assignedEmployees.length >= 2)
		{
			System.out.println("Office already has the maximum two Employees assigned");
		}
		else 
		{
			assignedEmployees[assignedEmployees.length] = employee;
		}
	}
	
	public Employee nrofEmployeeinOffice(int index)
	{
		return assignedEmployees[index];
	}
	
	public int getnrofEmployeeinOffice()
	{
		return assignedEmployees.length;
	}


    public String ToString(){
        String string="";
        string+="Office" + GetRoomNumber() + " has" + assignedEmployees.length + " employees";
        string+="";

        for(int i = 0; i < getnrofEmployeeinOffice(); i++)
		{
			string += "\nEmployee " + i ;
            string += "\n" + assignedEmployees[i].toString();
		}

        return string;
    }

}