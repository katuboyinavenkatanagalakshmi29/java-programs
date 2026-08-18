package com.fundamentals;

public class Employee {
	
	int Eid;
	String Ename;
	int sal;
	int experience;
	char grade;
	String permanentstatus;
	
	void display() {
		System.out.println("employee id        :" + Eid);
		System.out.println("employee name      :" + Ename);
		System.out.println("employee sal       :" + sal);
		System.out.println("employee experience:" + experience);
		System.out.println("employee grade     :" + grade);
		System.out.println("permanentstatus    :" + permanentstatus);
		
		
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		System.out.println("******STUDENT 1 DETAILS**************");
		
		e1.Eid = 101;
		e1.Ename = "Manju";
		e1.sal = 20000;
		e1.experience = 2;
		e1.grade = 'A';
		e1.permanentstatus = "active";
		
		e1.display();
		
		System.out.println("******STUDENT 2 DETAILS**************");
		
		e2.Eid = 102;
		e2.Ename = "Durga";
		e2.sal = 30000;
		e2.experience = 3;
		e2.grade = 'A';
		e2.permanentstatus = "active";
		
		e2.display();
		
		System.out.println("******STUDENT 3 DETAILS**************");
		
		e3.Eid = 103;
		e3.Ename = "Lakshmi";
		e3.sal = 30000;
		e3.experience = 3;
		e3.grade = 'A';
		e3.permanentstatus = "active";
		
		e3.display();
		
		
		
		
		
	
	}

}
