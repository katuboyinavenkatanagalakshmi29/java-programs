package com.corejava;

public class TestDemo3 extends Object {
	static TestDemo3 t = new TestDemo3();
	
	TestDemo3 obj;
	
	@Override
	protected void finalize() {
		System.out.println("finalize method called...!!!");
			}
	
	static void display () {
		TestDemo3 t3 = new TestDemo3();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(t);
		TestDemo3 t1 = new TestDemo3();
		System.out.println(t1);
		TestDemo3 t2 = new TestDemo3();
		System.out.println(t2);
		
		
		// nullifying
		t= null;
		
		// re - assigning
		t1 = t2;
		
		// Anonymous 
		new TestDemo3();
		
		// Method inside the object / out of scope 
		
		display();
		
		// island of isolation
		
		TestDemo3 t4 = new TestDemo3();
		TestDemo3 t5 = new TestDemo3();
		
		t4.obj = t5;
		t5.obj = t5;
				
		t4 = null;
		t5 = null;
		
		System.gc();



	

	}

}
