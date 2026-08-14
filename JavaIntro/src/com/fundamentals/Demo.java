package com.fundamentals;

import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter name");
		System.out.println("Enter rollNo");
		System.out.println("Mobile");
		System.out.println("branch");
		System.out.println("marks");
		
		
		
		String name = sc.nextLine();		
		int rollNo =  sc.nextInt();
		long mobile = sc.nextLong();
		String branch = sc.next();
		float marks = sc.nextFloat();
		
		
		System.out.println("********STUDENT DETAILS******************");
		System.out.println("Name      :" + name);
		System.out.println("Roll No   :" + rollNo);
		System.out.println("mobile    :" +  mobile );
		System.out.println("branch    :" +  branch );
		System.out.println("marks     :" +  marks );
      }

}