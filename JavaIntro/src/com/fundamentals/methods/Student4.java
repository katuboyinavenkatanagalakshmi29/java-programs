package com.fundamentals.methods;

public class Student4 {
	
	void id (int id) {
		System.out.println(id);
	}
	
	void name (String name) {
		System.out.println(name);
		
	}
	
	void branch (String branch) {
		System.out.println(branch);
	}
	
	void yop (int yop) {
		System.out.println(yop);
	}

	public static void main(String[] args) {
		
		Student4 s = new Student4();
		
		s.id(100);
		s.name("manju");
		s.branch("cse");
		s.yop(2026);
		
		
	}

}
