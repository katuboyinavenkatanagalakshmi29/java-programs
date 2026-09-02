package com.fundamentals.methods;

import java.util.Scanner;

public class Student3 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id is:");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("student name is:");
		String name = sc.nextLine();
		
		System.out.println("rollno is:");
		int rollno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter branch is:");
		String branch = sc.nextLine();
		
		System.out.println("********************************");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(branch);
		
		
		
	}

}
