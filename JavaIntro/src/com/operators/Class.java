package com.operators;

// Arithmetic Operators + - / % * 

import java.util.Scanner;

public class Class {
	
	double addition(float a , double b) {
		double sum = a + b;
		return sum;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Class c1 = new Class();
		
		System.out.println("enter first number is : ");
		float a1 = sc.nextFloat();
		
		System.out.println("enter second numbers is :");
		double a2 = sc.nextDouble();
		
		double sum = c1.addition(a1,a2);
		System.out.println("sum of the two numbers are :"+ sum);// string with (+ operator) is concatenation
		
		int a = 10;
		int b = 20;
		System.out.println("addition is : " + a + b);//1020
		System.out.println("addition is : " +(a + b ));//30
		
		System.out.println("subration is : "+ (b - a));// 10
		//BODMAS ----> we does not give parenthesis for multiplication operator
		System.out.println("multiplicatin is : "+ a * b);
		
		int x = 98;
		int y = 4;
		
		System.out.println("division is---> quotient : " + x / y); //98/4 -----> 24
		System.out.println("modulus is----> remainder: " + x % y);
		
		
		
		
		
		
	}

}
