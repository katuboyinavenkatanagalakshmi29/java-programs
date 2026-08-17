package com.fundamentals;

 public class MobileCompany {
	
	static String MobileName = "Iphone";
	static String Company = "TATA ELECTRONICS";
	
	String model = "New model";
	String Brand = "New Brand" ;
	int price = 80000;
	
	static {
		System.out.println("Static Block Excuted");
	}
	
	{
		System.out.println("Instance Block Excuted");
		
	}
	
	static void displayMobileName() {
		System.out.println("MobileName :"+ MobileName);
		System.out.println("Company :" + Company);
	}
	
	void displayMobile() {
		System.out.println("model:"+ model);
		System.out.println("Brand:"+ Brand);
		System.out.println("price:"+ price);
		
	}
	
	
	

	public static void main(String[] args) {
		
		displayMobileName();
		
		MobileCompany m1 = new MobileCompany();
		MobileCompany m2= new MobileCompany();
		MobileCompany m3= new MobileCompany();
		 
		 
		m1.model = "New model";
		m1.Brand = "New Brand" ;
		m1.price = 80000;
		
		m1.displayMobile();
		
		m2.model = "New model";
		m2.Brand = "New Brand" ;
		m2.price = 60000;
		
		m2.displayMobile();
		
		m3.model = "New model";
		m3.Brand = "New Brand" ;
		m3.price = 40000;
		
		m3.displayMobile();
		
		
		
		

	}

}
