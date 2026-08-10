package com.corejava;

public class EmployeeDetails {
	
	// static values 
	static String departmentName;
	static String location;
	
	// instance values 
	int emp_id;
	String name;
	long mobile;
	String email;
	
	public static void main(String[] args) {
		
		// creating object
		
		EmployeeDetails e1 = new EmployeeDetails();
		EmployeeDetails e2 = new EmployeeDetails();
		EmployeeDetails e3 = new EmployeeDetails();
		EmployeeDetails e4 = new EmployeeDetails();
		EmployeeDetails e5 = new EmployeeDetails();
		
		// Accessing the static data
		
		departmentName = "software";
		location = "hyderbad";
		
		// Accessing the instance values 
		
		e1.emp_id = 101;
		e1.name = "Manju";
		e1.mobile = 9876543210L;
		e1.email = "manju@gmail.com";
		
	
		System.out.println("*************Employee1 Details**************");
		System.out.println("departmentName :" + departmentName);
		System.out.println("location       :"+ location);
		System.out.println("emp_id         :"+ e1.emp_id);
		System.out.println("name           :"+ e1.name);
		System.out.println("mobile         :"+ e1.mobile);
		System.out.println("email          :"+ e1.email);
		
		e2.emp_id = 102;
		e2.name = "Sindhu";
		e2.mobile = 8466872834L;
		e2.email = "sindhu@gmail.com";
		

		System.out.println("*************Employee2 Details**************");
		System.out.println("departmentName :" + departmentName);
		System.out.println("location       :"+ location);
		System.out.println("emp_id         :"+ e2.emp_id);
		System.out.println("name           :"+ e2.name);
		System.out.println("mobile         :"+ e2.mobile);
		System.out.println("email          :"+ e2.email);
		
		e3.emp_id = 103;
		e3.name = "Ammu";
		e3.mobile = 1234567890L;
		e3.email = "ammu@gmail.com";
		
		System.out.println("*************Employee3 Details**************");
		System.out.println("departmentName :" + departmentName);
		System.out.println("location       :"+ location);
		System.out.println("emp_id         :"+ e3.emp_id);
		System.out.println("name           :"+ e3.name);
		System.out.println("mobile         :"+ e3.mobile);
		System.out.println("email          :"+ e3.email);
		
		departmentName = "Jfs";
		location = "kukkatpally";
		e4.emp_id = 104;
		e4.name = "Lavs";
		e4.mobile = 1234567890L;
		e4.email = "lavanya@gmail.com";
		
		
		System.out.println("*************Employee4 Details**************");
		System.out.println("departmentName :" + departmentName);
		System.out.println("location       :"+ location);
		System.out.println("emp_id         :"+ e4.emp_id);
		System.out.println("name           :"+ e4.name);
		System.out.println("mobile         :"+ e4.mobile);
		System.out.println("email          :"+ e4.email);
		
		

	}

}
