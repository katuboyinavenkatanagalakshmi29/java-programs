package com.fundamentals.methods;



public class Student2 {
	
	void id( int id) {
		System.out.println(id);
	}
	
	void sname (String sname) {
		System.out.println(sname);
	}
	
	void branch (String branch) {
		System.out.println(branch);
	}
	
	void rollNo (int rollNo) {
		System.out.println(rollNo);
	}
	void yop (int yop) {
		System.out.println(yop);
	}

	public static void main(String[] args) {
		
		Student2 s = new Student2();
		
		s.id(101);
		s.sname("manju");
		s.branch("cse");
		s.rollNo(537);
		s.yop(2026);
		
		
		
		
	}

}
