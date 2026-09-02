package com.constructors;

public class Bike {
	

	String model;
	String brand;
	double price;
	int year;
	String color;
	
	Bike(){
		this("new model", "new brand");
		System.out.println("no arg constructor called");
		
	}
	public Bike(String model, String brand) {
		this(model, brand , 10000.00);
	}
	
	public Bike(String model, String brand, double price) {
		this(model, brand, price, 2016);
	}
	
	public Bike(String model, String brand, double price, int year) {
		this(model, brand, price,year,"black");
	}
	
	public Bike(String model, String brand, double price, int year, String color) {
		
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public static void main(String[] args) {
		
		System.out.println("welcome to bike showroom");
		
		Bike b = new Bike("old model", "newbrand", 300000.00, 2016, "white");
		b.BikeInfo();
		
		System.out.println("******************************************");
		
		Bike b1 = new Bike("Classic","Royal Enfield");
		b1.BikeInfo();   
		
		System.out.println("******************************************");
	
		Bike b2 = new Bike();
		b2.BikeInfo();
		
		
		
		
		
	}
	
	void BikeInfo() {
		System.out.println("model of the Bike :"+ model);
		System.out.println("brand of the Bike :"+ brand);
		System.out.println("price of the Bike :"+ price);
		System.out.println("year of the Bike  :"+ year);
		System.out.println("color of the Bike :"+ color);
	}


}
