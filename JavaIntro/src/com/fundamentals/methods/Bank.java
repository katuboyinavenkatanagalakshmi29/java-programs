package com.fundamentals.methods;

import java.util.Scanner;

public class Bank {
	
	String name;
	long AccountNumber;
	double balance;
	
	 void CreateAccount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("account holder name is:");
		String name = sc.nextLine();
		
		System.out.println("Account number is:");
	    long AccountNumber = sc.nextLong();
		
		System.out.println("Total balance is :");
		double balance = sc.nextDouble();
	}
	
	 void deposite () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter amount to deposite:");
		double amount = sc.nextDouble();
		
		balance = balance + amount;
		
		System.out.println("Amount deposited sucussfully..!!!");
		
		
	}
	 
	 void withdraw () {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter amount to withdraw:");
		 double amount = sc.nextDouble();
		 
		 if(amount <= balance) {
			 balance = balance + amount;
		 
			 System.out.println("Money withdraw successfully...!!!");
		 } 
		 else 
		 {
			System.out.println("insufficient balance"); 
		 }
				 
	 }		 
			 
       void display() {
		 
		 System.out.println(name);
		 System.out.println(AccountNumber);
		 System.out.println(balance);
		
		 
	 }
	
	

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		b.CreateAccount();
		b.deposite();
		b.withdraw();
		b.display();
		
		}

}
