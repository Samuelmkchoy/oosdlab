package jlab6;

public class Teacher extends Person {
	//Variables
	private int numCourses;
	private String[] courses = new String[5];
	
	//Constructor
	public Teacher(String name, String address) {
		super(name, address);

	}

	//toString
	public String toString() {
		return "Teacher: " + super.toString() ;
	}

	//Misc Methods
	public boolean addCourse(String course) {
		if (numCourses == 5) 
			{
				return false;
			} 
		else 
			{
				courses[numCourses] = course;
				numCourses++;
				return true;
			}
		
	}		
	public boolean removeCourse(String course){
		if (numCourses == 5) 
		{
			return false;
		} 
	else 
		{
			courses[numCourses] = course;
			numCourses--;
			return true;
		}
	
	}
}
				
		
