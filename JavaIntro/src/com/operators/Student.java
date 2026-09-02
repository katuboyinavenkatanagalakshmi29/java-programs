package com.operators;

public class Student {
	
	int rollNo;
	String name;
	int age;
	
	// no-arg constructor
	Student() {
		System.out.println("no-arg constructor called");
		rollNo = 100;
		name = "manju";
		age = 21;
	}

   // why we use this keyword ---> better for code readability and maintainability
	// parameterized constructor
     
	Student (int rollNo, String name,int age) {
    	 this.rollNo = rollNo;
    	 this.name = name;
    	 this.age = age;
    	 
	}
     
     public static void main(String []args) {
		
		Student s1 = new Student();
		s1.studentInfo();
		
		System.out.println("**********************************");

		Student s2 = new Student (102, "Srinivas", 21);
		s2.studentInfo();
		
		System.out.println("**********************************");
		
		Student s3 = new Student (103, "Sindhu", 21);
		s3.studentInfo();
		
	}
	
	void studentInfo() {
		
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(age);
		
	}
	
}
