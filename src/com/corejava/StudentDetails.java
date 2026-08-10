package com.corejava;

public class StudentDetails {
	// Static variables 
	static String collegename;
	static String location;
	
	// Instance variables 
	int rollno;
	String name;
	long mobile;
	String email;
	String branch;
	
	public static void main(String[] args) {
		// Setting static values 
		
		collegename = "PITW college";
		location = "TENALI";
		
		// creating object 
		StudentDetails s1 = new StudentDetails();
		
		// Setting instance values 
		s1.rollno = 101;
		s1.name = "Manju";
		s1.mobile = 9876543210L;
		s1.email = "manju@gmail.com";
		s1.branch = "cse";
		
		//printing student details 
		System.out.println("collegename:"+ StudentDetails.collegename);
		System.out.println("location   :"+ StudentDetails.location);
		System.out.println("roll no    :"+ s1.rollno);
		System.out.println("name       :"+ s1.name);
		System.out.println("mobile     :"+ s1.mobile);
		System.out.println("email      :"+ s1.email);
		System.out.println("branch     :"+ s1.branch);
		
 

	}

}
