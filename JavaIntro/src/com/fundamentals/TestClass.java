package com.fundamentals;

public class TestClass {
	
	int id = 101;
	String name = "Manju";
	String branch = "CSE";
	
	
	void displayid () {
		System.out.println("id:"+ id);
		
	}
	
	void displayname () {
		System.out.println("name:"+ name);
		
	}
	
	void displaybranch () {
		System.out.println("branch:"+ branch);
	}
	
	public static void main (String[] args) {
		
		TestClass t1 = new TestClass();
		
		t1.displayid();
		t1.displayname();
		t1.displaybranch();
		
		
		
	}

}
