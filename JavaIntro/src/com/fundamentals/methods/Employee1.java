package com.fundamentals.methods;

import java.util.Scanner;

public class Employee1 {
	
	int id;
	String name;
	String department;
	double salary;
	
	void getempdetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee id is:");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Employee name is :");
		name = sc.nextLine();
		
		System.out.println("Department is:");
		department = sc.nextLine();
		
	}	
	
	void getsaldetails () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total salary is:");
		double salary = sc.nextDouble();
		
		if (salary > 50000) {
			System.out.println("Congratualation you will get a job..!!!");
		} else {
				System.out.println("Sorry try again...!!!");
			}
		}
	

	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		
		e.getempdetails();
		e.getsaldetails ();
		
		
		
	}

}
