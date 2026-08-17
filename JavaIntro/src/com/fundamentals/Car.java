package com.fundamentals;

public class Car {
	
	static String CarName = "BENZ";
	
	String model;
	int price;
	String color;
	
	static {
		System.out.println("static block executed");
	}
	
	{
		System.out.println("instance block executed");
	}

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Car c1 = new Car();
		
		c1.model = "new model";
		c1.price = 20000;
		c1.color = "Red";
		
		System.out.println("CarName:"+ CarName);
		System.out.println("model  :"+ c1.model);
		System.out.println("price  :"+c1.price);
		System.out.println("color :"+ c1.color);
		
		System.out.println("main method ended");
		
		
	
	}

}
