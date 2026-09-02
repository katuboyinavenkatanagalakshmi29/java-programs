package com.fundamentals.methods;

public class Arthemetic {
	
	void addition (int a, int b ) {
		System.out.println("addition:" + (a+b));
		subtraction(10, 5);
	}
	
	void subtraction(int a, int b) {
		System.out.println("subtraction:"+( a - b));
		division(10, 5);
	}
	 
	void division (int a , int b) {
		System.out.println("division :"+ (a/b));
		multiplication(10, 5);
	}
	
	void multiplication (int a , int b) {
		System.out.println("multipilcation:"+ (a*b));
	}

}
