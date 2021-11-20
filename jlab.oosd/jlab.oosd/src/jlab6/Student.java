package jlab6;

public class Student extends Person {
	//Variables
	private int numCourses;
	private String[] courses = new String[5];
	private int[] grades = new int[5];
	
	//Constructor
	public Student(String name, String address) {
		super(name, address);
	}
	
	//toString
	public String toString() {
		return "Student: " + super.toString();
	}
		
	//Misc Methods
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
	}

	public void printGrades() {
		//System.out.println("Student Grades:");
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i] + ": " + grades[i]);
		}
	}
	
	public double getAverageGrade() {
		double count = 0;
		for (int i = 0 ; i< numCourses; i++) {
			count += grades[i];
		}
		double average = count / numCourses;
		return average;
	}
}
