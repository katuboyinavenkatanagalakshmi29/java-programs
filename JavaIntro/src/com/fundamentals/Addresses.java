package com.fundamentals;


 class Student3 {
	 
	int id;
	String name;
	Addresses address;
	
}

public class Addresses{
	String city;
	String country;



	public static void main(String[] args) {

		Student3 s1 = new Student3();

		s1.id = 101;
		s1.name = "manju";
		s1.address = new Addresses();

		s1.address.city = "hyd";
		s1.address.country = "India";

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println(s1.address.country);

	}

}
