package com.corejava;

 class TestDemo1 {
	
	// we cannot call instance methods in static directly
	// so, we create object to call instance methods
	// we can call static methods in static directly
	// we can call instance methods in static directly..!!!
	
	static void method1 () {
		System.out.println("method1 called");
		TestDemo1 t1 = new TestDemo1();
    	t1.method2();
		
	}
	
    void method2 () {
    	System.out.println("method2 called");
    	method3();
	}
    static void method3 () {
		System.out.println("method3 called");
		TestDemo1 t2 = new TestDemo1();
    	t2.method4();
	}
    void method4 () {
		System.out.println("method4 called");
		method5();
	}
    static void method5 () {
		System.out.println("method5 called");
		TestDemo1 t3 = new TestDemo1();
    	t3.method6();
	}
    void method6 () {
		System.out.println("method6 called");
		method7();
	}
    static void method7 () {
		System.out.println("method7 called");
		TestDemo1 t4 = new TestDemo1();
    	t4.method8();
	}
     void method8 () {
		System.out.println("method8 called");
		method9();
	}
    static void method9 () {
		System.out.println("method9 called");
		TestDemo1 t2 = new TestDemo1();
    	t2.method10();
	}
    void method10 () {
		System.out.println("method10 called");
		
	}


	public static void main(String[] args) {
		System.out.println("mainmethod started");
		method1();
		
		
		System.out.println("mainmethod ended");
	}

}
