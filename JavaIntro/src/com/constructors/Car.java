package com.constructors;

public class Car {
	
	String model;
	String brand;
	double price;
	int year;
	String color;
	
	// no arg constructor
	Car(){
		System.out.println("no arg constructor called");
	}
	// 2 arg constructor
	Car(String model, String brand) {
		
		this.model = model;
		this.brand = brand;
	}
	// 3 arg constructor
	
    Car(String model, String brand,double price) {
		
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
    
    //4 arg constructor
    

    Car(String model, String brand,double price, int year) {
		
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
    
 Car(String model, String brand,double price, int year, String color) {
		
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	

	public static void main(String[] args) {
		
		System.out.println("welcome to car showroom");
		
		
		Car c1 = new Car();
		c1.carInfo();
		
		
		Car c2 = new Car("old","new");
		c2.carInfo();
		
		Car c3 = new Car("old","new",2000000.00);
		c3.carInfo();
		
		Car c4 = new Car("old","new",3000000.00,2016);
		c3.carInfo();
		
		Car c5 = new Car("old","new",3000000.00,2016, "black");
		c5.carInfo();

	
		
		
	}
	
	void carInfo() {
		System.out.println("model of the car:"+ model);
		System.out.println("brand of the car:"+ brand);
		System.out.println("price of the car:"+ price);
		System.out.println("year of the car :"+ year);
		System.out.println("color of the car:"+ color);
	}

}
