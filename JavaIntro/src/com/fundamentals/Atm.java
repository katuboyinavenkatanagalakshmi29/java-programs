package com.fundamentals;

public class Atm {
	
	static int ACNo;
	
	String Cname;
	int bal;
	String status;
	
	{
		ACNo++;
	}
	
	void display() {
		System.out.println(Cname);
		System.out.println(ACNo);
		System.out.println(bal);
		System.out.println(status);
	}

	public static void main(String[] args) {
		
		 Atm a1 = new  Atm();
		 
				 
		 a1.Cname = "Manju";
		 a1.bal = 50000;
		 ACNo=123;
		 a1.status = "active";
		 
		  a1.display();
		 
		 System.out.println("*******************************");
		
		
		 Atm a2 = new  Atm();
		 a2.Cname = "Devi";
		 a2.bal = 40000;
		 a2.status = "active";
		 
		 a2.display();
		
		 System.out.println("*******************************"); 
		 
		 Atm a3 = new  Atm();
		 a3.Cname="ghj";
		 a3.bal = 50000;
		 a3.status = "active";
		 
		 a3.display();
		 
		
		
		
	}

}
