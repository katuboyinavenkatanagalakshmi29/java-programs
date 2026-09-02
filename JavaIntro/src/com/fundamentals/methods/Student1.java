package com.fundamentals.methods;

import java.util.Scanner;

public class Student1 {
	
	int id;
	String name;
	String branch;
	int physics;
	int chemistry;
	int maths;
	
	void getstudentdetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("student id is: ");
	    id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("student name is:");
		name = sc.nextLine();
		
		System.out.println("student branch is:");
		branch = sc.nextLine();
		
	}
	
	void getmarks() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("physics marks is:");
		physics = sc.nextInt();
		
		System.out.println("chemistry marks is :");
		chemistry = sc.nextInt();
		
		System.out.println("maths marks is:");
		maths = sc.nextInt();
		
	}
	
	void calculation () {
		
		Scanner sc = new Scanner(System.in);
		
		
		if (physics > 50) {
			System.out.println("you are passed in physics");
		} else {
			System.out.println("you are failed in physics");
		}
		if (chemistry > 50) {
			System.out.println("you are passed in chemistry");
			
		}else {
			System.out.println("you are failed in chemistry ");
		}
		if (maths > 75) {
			System.out.println("you are passed in maths");
		}
		else {
				System.out.println(" you are failed in chemistry");
		}
				
			
		}
		
		
	

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		
		s.getstudentdetails();
		s.getmarks();
		s.calculation();
		
	}
		
		




}
