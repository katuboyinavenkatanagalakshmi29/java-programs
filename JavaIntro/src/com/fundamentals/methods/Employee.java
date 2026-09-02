package com.fundamentals.methods;

public class Employee {
	
	static void ename (String name) {
	System.out.println(name);
	}
	
	void eid (int eid) {
		System.out.println(eid);
	}
	
	void department (String department) {
		System.out.println(department);
	}
	
	void salary (int salary) {
		System.out.println(salary);
	}
	
	void experience (String experience) {
		System.out.println(experience);
		
	}
	
	void CompanyName (String companyname) {
		System.out.println(companyname);
		
	}
	
      public  static void main(String [] args) {
		 
		 Employee e1 = new Employee();
		
		
     	ename("manju");
		e1.eid(101);
	    e1.department("software");
		e1.salary(20000);
		e1.experience("2years");
	    e1.CompanyName("Infosys");
		
		
		
		
		
	}

}
