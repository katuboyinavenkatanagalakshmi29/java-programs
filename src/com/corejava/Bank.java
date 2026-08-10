package com.corejava;

public class Bank {
	
	static int totalBankBalance = 0;
	
	String Bankname;
	
	public Bank (String Bankname) {
		this.Bankname = Bankname;
		totalBankBalance++;
	}
	 void display() {
		 System.out.println("Bankname:"+ Bankname);
	 }

	public static void main(String[] args) {
		
		Bank b1 = new Bank("SBI");
		Bank b2 = new Bank("indian");
		
		b1.display();
		b2.display();
		System.out.println("total bank balance:"+ totalBankBalance);
		

	}

}
