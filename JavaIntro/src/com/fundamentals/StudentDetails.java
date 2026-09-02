package com.fundamentals;

public class StudentDetails {
	
	static String CollegeName = "PITW";
	
	
    Integer studentid = 101;
	String studentName = "MANJU";
    Character gender = 'F';
	String branch = "CSE";
	
	void displaycollegedetails() {
		
		System.out.println("CollegeName  :"+ CollegeName);
	}
	
	void studentdetails () {
		
        System.out.println("Studentid    :"+ studentid);
		System.out.println("StudentName  :"+ studentName);
		System.out.println("Gender       :"+ gender);
		System.out.println("Branch       :"+ branch);
		
	}
	

	public static void main(String[] args) {
		
		StudentDetails s1 = new StudentDetails();
		
		s1.displaycollegedetails();
		
		s1.studentdetails();
		
		
		
		
		
	}

}
