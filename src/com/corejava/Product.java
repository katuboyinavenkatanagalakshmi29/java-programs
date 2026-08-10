package com.corejava;

public class Product {
	
	// static values 
	static String companyName;
	
	// instance values
	int productid;
	String name;
	int price;
	String info;
	

	public static void main(String[] args) {
		
		// setting static values 
		
		companyName = "Madhuram";
		
		// creating a object 
		Product p1 = new Product();
		Product p2 = new Product();
	
		// setting instance values 
		
		p1.productid = 101;
		p1.name = "sunscreen";
		p1.price = 500;
		p1.info = "It is good for skin protection";
		
		System.out.println("***********PRODUCT1 INFO*******");
		System.out.println("companyName:"+ companyName);
		System.out.println("productid  :"+ p1.productid );
		System.out.println("name       :"+ p1.name );
		System.out.println("price      :"+ p1.price);
		System.out.println("info       :"+ p1.info );
				
		
		
		p2.productid = 102;
		p2.name = "5star";
		p2.price = 10;
		p2.info = "Eat 5star do nothing";
		

		System.out.println("***********PRODUCT2 INFO*******");
		System.out.println("companyName:"+ companyName);
		System.out.println("productid  :"+ p2.productid );
		System.out.println("name       :"+ p2.name );
		System.out.println("price      :"+ p2.price);
		System.out.println("info       :"+ p2.info );
	}

}
