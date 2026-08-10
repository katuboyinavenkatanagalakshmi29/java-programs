package com.corejava;

public class Car {
	
	static int totalCars = 0;
	
	String CarName;
	
	public Car (String CarName) {
		this.CarName = CarName;
		totalCars++;
	}
	
	void display() {
		
		System.out.println("CarName:"+ CarName);
		
	
	}
	 


	public static void main(String[] args) {
		
		Car c1 = new Car("BMW");
		Car c2 = new Car("AUDI");
		Car c3 = new Car("THAR");
		Car c4 = new Car("BENZ");
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();

	
		
		System.out.println(" total cars :"+ totalCars);
		
		
		
		
		
	}

}
