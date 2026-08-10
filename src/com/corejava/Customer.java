package com.corejava;

public class Customer {
	
	@Override
	protected void finalize()  {
		System.out.println("finalize called");
	}
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		c1 = null;
		c2 = null;
		c3 = null;
		
		c1 = c2;
		c2 = c1;
		
		System.gc();
		
	}

}
