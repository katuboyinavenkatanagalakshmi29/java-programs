package com.corejava;

public class Banking {
	
	// static values 
	
	static String BankName;
	
	// Instance Values 
	
	int bankno;
	int acno;
	int mobile;
	String branch;
	
	
	

	public static void main(String[] args) {
		
		Banking b = new Banking();
		
		BankName = "Indian";
		
		// instance values 
		
		b.bankno = 101;
		b.acno = 987654321;
		b.mobile = 54321;
		b.branch = "SBI";
		
		System.out.println("*****************BANK DETAILS*******************");
		System.out.println("BankName        :"+ BankName);
		System.out.println("bankno          :"+ b.bankno);
		System.out.println("acno            :"+ b.acno);
		System.out.println("mobile          :"+ b.mobile);
		System.out.println("branch          :"+ b.branch);
		
		
		
		
	}

}
