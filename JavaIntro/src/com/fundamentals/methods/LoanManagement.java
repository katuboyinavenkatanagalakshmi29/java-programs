package com.fundamentals.methods;

import java.util.Scanner;

public class LoanManagement {
	
	
	String CustomerName;
	double LoanAmount;
	double intrestRate;
	int Loantenure;
	double intrest;
	
	double caluclateIntrest(double LoanAmount, double intrestRate) {
		double intrest =(LoanAmount * intrestRate * Loantenure)/100 ;
		return intrest;
		
	}
	
	double calculateTotalAmount(double intrest) {
	
		double totalamount = LoanAmount + intrest;
		return totalamount;
	}
	
	double calculateMonthlyEMI(double totalAmount, int Loantenure){
		double emi = totalAmount / (Loantenure *12);
		return emi;
	}
	
	void displayLoanSummery(double intrest, double totalamount, double emi) {
		System.out.println("customer name :"+ CustomerName);
		System.out.println("LoanAmount    :"+ LoanAmount);
		System.out.println("intrestRate   :"+ intrestRate);
		System.out.println("Loantenure    :"+ Loantenure);
		System.out.println("Intrest       :"+ intrest);
		System.out.println("Amount        :"+ totalamount);
		System.out.println("EMI           :"+ emi);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//First Object
		
		LoanManagement l1 = new LoanManagement();
		
		System.out.println("Enter name is :");
		l1.CustomerName = sc.nextLine();
		
		System.out.println("Enter loanAmount is :");
		l1.LoanAmount = sc.nextDouble();
		
		System.out.println("enter intrestamount is :");
		l1.intrestRate = sc.nextDouble();
		
		System.out.println("Enter Loantenure :");
		l1.Loantenure = sc.nextInt();
		
	   double intrest = l1.caluclateIntrest(l1.LoanAmount, l1.intrestRate);
	   double totalamount = l1.calculateTotalAmount(intrest);
	   double emi = l1.calculateMonthlyEMI(totalamount,l1.Loantenure);
	   l1.displayLoanSummery(intrest,totalamount,emi);
	   
	   LoanManagement l2 = new LoanManagement();
	   sc.nextLine();
	   System.out.println("Enter name is :");
		l2.CustomerName = sc.nextLine();
		
		System.out.println("Enter loanAmount is :");
		l2.LoanAmount = sc.nextDouble();
		
		System.out.println("enter intrestamount is :");
		l2.intrestRate = sc.nextDouble();
		
		System.out.println("Enter Loantenure :");
		l2.Loantenure = sc.nextInt();
		
		
		double intrest1 = l2.caluclateIntrest(l2.LoanAmount,l2.intrestRate);
		double totalamount1 = l2.calculateTotalAmount(intrest);
		double emi1 = l2.calculateMonthlyEMI(totalamount,l2.Loantenure);
		l2.displayLoanSummery(intrest1,totalamount1,emi1);
		
		
		
	}

}
