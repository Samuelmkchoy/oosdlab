package jlab8q2;

public class TestPerson 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("Ming", 500000);
		Student s = new Student("Chan", "Software Development");
		
		Person[] people = new Person[2];
		people[0] = e;
		people[1] = s;
		
		for(int i = 0; i < 2; i++) 
		{
			System.out.println("Name: " + people[i].getName());
			System.out.println("Description: " + people[i].getDescription());
		}
	}

}
