package com.fundamentals;

public class StudentTest1 {
	
	static String CollegeName = "PITW";
	
	String StudentName = "manju";
	byte age = 21;
	short addmissionyear = 2022;
	int rollno = 537;
	long mobile = 9876543210L;
	float attendencepercentage = 75.5F;
	int fee = 60000;
	char grade = 'A';
	boolean passfail = true;
	long Sid = 98765432101234565L;
	float feepaid = 30.500f;
	
	
	void displaystudentdetails () {
		System.out.println(StudentName);
		System.out.println(age);
		System.out.println(addmissionyear);
		System.out.println(rollno);
		System.out.println(mobile);
		System.out.println(attendencepercentage);
		System.out.println(fee);
		System.out.println(grade);
		System.out.println(passfail);
		System.out.println(Sid);
		System.out.println(feepaid);
	}
	
	static void displaycollegedetails() {
		System.out.println(CollegeName);
	}
	
	
	
	
	public static void main(String[] args) {
		
		displaycollegedetails();
		
		StudentTest1 s1 = new StudentTest1();
		
		 s1.displaystudentdetails();
		
	}

}
