package com.constructors;

public class Customer {
	
	int cid;
	String name;
	
	
	// No-arg constructor
	Customer(){
		System.out.println("no-arg constructor called");
		
		cid = 100;
		name = "unknown";
	}
	
	static void hello() {
		Customer c = new Customer();
		c.show();
		
	}

	public static void main(String[] args) {
		
		
		
		Customer c = new Customer();
		System.out.println(c.cid);
		System.out.println(c.name);
		
		c.show();
		c.hello();
		
		Customer c1 = new Customer();
		System.out.println(c.cid);
		System.out.println(c.name);
		
	}
	
	void show() {
		System.out.println("Customer Id :"+ cid);
		System.out.println("Customer Name :" +name);
		
	}

}

