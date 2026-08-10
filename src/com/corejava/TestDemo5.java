package com.corejava;

public class TestDemo5 {
	
	TestDemo5 obj;
	
	@Override
	protected void finalize()  {
		System.out.println("finalize method called...!!!");
	}
	static void display() {
		TestDemo3 t3 = new TestDemo3();
	}
	
	

	public static void main(String[] args) {
		TestDemo3 t  = new TestDemo3();
		TestDemo3 t1 = new TestDemo3();
		TestDemo3 t2 = new TestDemo3();
		
		System.out.println(t);
		t = null;
		
		t1 = t2;
		
		
		new TestDemo5();
		
		display();
		
		TestDemo3 t4 = new TestDemo3();
		TestDemo3 t5 = new TestDemo3();
		
		t4.obj = t5;
		t5.obj = t4;
		
		t4 = null;
		t5 = null;
		
		System.gc();
		
		

	}

}
