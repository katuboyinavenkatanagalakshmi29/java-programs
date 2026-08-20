package com.fundamentals;

public class StudentTest {

	static int id = 123;

	String name;
	String branch;
	int marks;

	{
		id++;
		System.out.println("id" + id);
	}

	void display() {

		System.out.println(name);
		System.out.println(branch);
		System.out.println(marks);
	}

	public static void main(String[] args) {

		StudentTest s1 = new StudentTest();
		s1.name = "Sindhu";
		s1.branch = "CSE";

		s1.marks = 100;

		s1.display();

		StudentTest s2 = new StudentTest();
		
		s2.name = "Manju";
		s2.branch = "CSE";
		s2.marks = 100;

		s2.display();
		
		StudentTest s3 = new StudentTest();

		s3.name = "Manju";
		s3.branch = "CSE";
		s3.marks = 100;

		s3.display();

	}

}
