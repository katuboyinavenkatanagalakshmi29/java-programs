package com.fundamentals;

public class Movies {
	
	static String MovieDirector = "Rajamouli";
	static String MovieName = "Bahubali";
	
	
	int ticketid;
	String ticketname;
	int availabletickets;
	
	static void displayMovieDetails() {
		System.out.println(MovieDirector);
		System.out.println( MovieName);
		
	}
	
	void displayticketDetails() {
		System.out.println(ticketid);
		System.out.println(ticketname);
		System.out.println(availabletickets);
	}
	
	void displayChangeMovieDirector() {
		
	}

	public static void main(String[] args) {
		
	}

}
