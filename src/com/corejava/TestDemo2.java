package com.corejava;

public class TestDemo2 {
	
	void method1() {
	System.out.println("method1 called");
	}
	

	void method2() {
	method1();
	System.out.println("method2 called");
	
	}
	

	void method3() {
	method2();
	System.out.println("method3 called");
	
	}
	

	void method4() {
	System.out.println("method4 called");
	
	}
	

	void method5() {
	method4();
	System.out.println("method5 called");
	}
	

	void method6() {
	method5();	
	System.out.println("method6 called");
	method3();
	}






	public static void main(String[] args) {
		
		TestDemo2 obj = new TestDemo2();
		obj.method6();

	}

}
