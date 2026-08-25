package com.fundamentals;

public class StudentTestDemo {
	
	static String CollegeName = "PITW";
	
	String StudentName = "MANJU";
	int age = 20;
	int admissionyear = 2022;
	int rollNo = 537;
	long mobilenumber = 9876543210L;
	int totalfee = 60000;
	char grade = 'A';
	boolean PF = true;
	double feepaid = 35.00d;
	

	public static void main(String[] args) {
		
		StudentTestDemo s1 = new StudentTestDemo();
		
		System.out.println(CollegeName);
		
		System.out.println(s1.StudentName);
		System.out.println(s1.age);
		System.out.println(s1.admissionyear);
		System.out.println(s1.rollNo);
		System.out.println(s1.mobilenumber);
		System.out.println(s1.totalfee);
		System.out.println(s1.grade);
		System.out.println(s1.PF);
		System.out.println(s1.feepaid);
		
		

	}

}
