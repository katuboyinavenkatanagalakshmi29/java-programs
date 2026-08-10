package com.corejava;

public class Bike {
	
	// static values
	static String brand;
	static String showroomlocation;
	
	// instance values
	String name;
	String color;
	int price;
	int bikeno;
	
	public static void main(String[] args) {
		
	//	creating object for bike
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
		// setting static values 
		
		brand = "hero honda";
		showroomlocation = "nandhigam";
		
		// setting instance values 
		
		b1.name = "ns";
		b1.color = "black and white";
		b1.price = 50000;
		b1.bikeno = 2677;
		
		System.out.println("**************BIKE1 DETAILS***************");
		System.out.println("brand           :"+ brand);
		System.out.println("showroomlocation:"+ showroomlocation);
		System.out.println("name            :"+ b1.name);
		System.out.println("color           :"+ b1.color);
		System.out.println("price           :"+ b1.price);
		System.out.println("bikeno          :"+ b1.bikeno);
		
		
		b2.name = "220";
		b2.color = "blue and black";
		b2.price = 50000;
		b2.bikeno = 2677;
		
		System.out.println("**************BIKE2 DETAILS***************");
		System.out.println("brand           :"+ brand);
		System.out.println("showroomlocation:"+ showroomlocation);
		System.out.println("name            :"+ b2.name);
		System.out.println("color           :"+ b2.color);
		System.out.println("price           :"+ b2.price);
		System.out.println("bikeno          :"+ b2.bikeno);
		

	}

}
