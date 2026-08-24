package com.fundamentals;

public class Movies {
	
	static String ManagerName = "Rajamouli";
	static String theaterName = "LakshmiPrasanna";
	
	
	int movieid;
	String moviename;
	String heroname;
	int availableseats;
	
	static void displayticketDetails() {
		System.out.println(ManagerName);
		System.out.println(theaterName);
		
	}
	
	void displayMovieDetails() {
		System.out.println(movieid);
		System.out.println(moviename);
		System.out.println(heroname);
		System.out.println(availableseats);
	
	}
	
	void displaybookseats () {
		availableseats--;
	}
	
	static void ChangeManager() {
		ManagerName = "Sukumar";
		
	}

	public static void main(String[] args) {
		
		displayticketDetails();
		
		System.out.println("****************************");
		
		Movies m1 = new Movies();
		Movies m2 = new Movies();
		
		m1.movieid = 101;
		m1.moviename = "Bahubali";
		m1.heroname = "Prabhas";
		m1.availableseats = 100;
		
		m1.displayMovieDetails();
		
		System.out.println("****************************");
		
		m2.movieid = 102;
		m2.moviename = "Bahubali PART2";
		m2.heroname = "Prabhas";
		m2.availableseats = 50;
		
		m2.displayMovieDetails();
		
		
		
		m1.displaybookseats();
		
		m2.displaybookseats();
		
		System.out.println("***********after changing available seats:****************");
		
		m1.displayMovieDetails();
		
		System.out.println("****************************");
		
		m2.displayMovieDetails();
		
		ChangeManager();
		
		System.out.println("*************After Changing manager name:****************");
		
		displayticketDetails();
		
		
	
		
		
		
	}

}
