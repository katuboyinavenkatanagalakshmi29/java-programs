package com.fundamentals;

public class Student {
	
	static String college = "PITW";
	
	int student_id;
	String student_name;
	int student_age;
	

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		
		s1.student_id = 101;
		s1.student_name = "Manju";
		s1.student_age = 21;
	
		
		System.out.println("main method stated...!!!");
		
		System.out.println(s1.student_id);
		System.out.println(s1.student_name);
		System.out.println(s1.student_age);
		
		System.out.println("main method ended");
		
		}

}
