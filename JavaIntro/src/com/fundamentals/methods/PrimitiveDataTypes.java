package com.fundamentals.methods;

import java.util.Scanner;

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student id:");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter name:");
		String name = sc.nextLine();
		
		System.out.println("enter age:");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("student branch:");
		String branch = sc.nextLine();
		
		System.out.println("enter yop:");
		int yop = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter email:");
		String email = sc.nextLine();
		
		System.out.println("enter gender:");
		char gender = sc.next().charAt(0);
		
		
		System.out.println("************************************");
		
		System.out.println("id:"+ id);
		System.out.println("name:"+name);
		System.out.println("age:"+ age);
		System.out.println("branch:"+ branch);
		System.out.println("yop:"+ yop);
		System.out.println("email:"+ email);
		System.out.println("gender:"+ gender);
		
		sc.close();
		
		

	}

}
