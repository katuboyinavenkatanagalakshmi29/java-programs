package com.corejava;

public class TestDemo4 {
	
	TestDemo4 obj;
	
	static void display() {
		
		TestDemo4 t3 = new TestDemo4();
	}
	
	@Override
	protected void finalize() {
		System.out.println("finalize method called...!!!");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestDemo4 t = new TestDemo4();
		
		// nullifying 
		
		t = null;
		
		// re assigning 
		
		TestDemo4 t1 = new TestDemo4();
		TestDemo4 t2 = new TestDemo4();
		
		t1 = t2;
		
		// method inside the object 
		
		display();
		
		// anonymous object 
		
		new TestDemo4();
		
		// island of isolation 
		
		TestDemo4 t4 = new TestDemo4();
		TestDemo4 t5 = new TestDemo4();
		
		t4.obj = t5;
		t5.obj = t4;
		
		t4 = null;
		t5 = null;
		
		
		System.gc();
		
		
		
		

	}

}
