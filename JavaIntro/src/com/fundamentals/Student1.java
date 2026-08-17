package com.fundamentals;

public class Student1 {
	
	// static variables
	
	static String CollegeName = "PITW";
	static String University = "JNTUK";
	
	// instance variables
	
	int id;
	String name;
	String branch;
	Long mobile;
	int yop;
	
	// static block 
	
	static  {
		System.out.println("Static block executed");
	}
	
	// instance block 
	
	{
		System.out.println(" Instance block excuted");
	}
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		// creating object 
		
		Student1 s1 = new Student1();
		
		
		s1.id = 101;
		s1.name = "manju";
		s1.branch = "cse";
		s1.mobile = 9876543210L;
		s1.yop = 2026;
		
		
		System.out.println("College Name :"+ CollegeName);
		System.out.println("University   :" + University);
		System.out.println("Student id   :" + s1.id);
		System.out.println("Student name :"+ s1.name);
		System.out.println("branch       : "+ s1.branch);
		System.out.println("mobile       :"+ s1.branch);
		System.out.println("yop          :"+ s1.yop);
		
		
		System.out.println("main method ended");
	}

}
