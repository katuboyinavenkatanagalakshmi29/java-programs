package com.fundamentals;

public class MethodCalling {
	
	static void method1() {
		System.out.println("method 1 calling");
		MethodCalling m1 = new MethodCalling();
		m1.method2();
	}
	
	void method2() {
		System.out.println("method 2 calling");
		method3();
	}

	static void method3() {
		System.out.println("method 3 calling");
		MethodCalling m2 = new MethodCalling();
		m2.method4();
	}

	void method4() {
		System.out.println("method 4 calling");
		method5();
	}

	static void method5() {
		System.out.println("method 5 calling");
		MethodCalling m3 = new MethodCalling();
		m3.method6();
	}

	void method6() {
		System.out.println("method 6 calling");
	}

	
	public static void main(String[] args) {
		method1();
	}

}
