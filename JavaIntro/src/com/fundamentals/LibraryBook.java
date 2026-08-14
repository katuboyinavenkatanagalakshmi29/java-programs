package com.fundamentals;

public class LibraryBook {
	
	static String LibraryName = "BookHeaven";
	static String LibrarianName = "Manju";
	
	int bookid;
	String booktitle;
	String authorname;
	int availablecopies;
	
	// method to display book details
	
	void displayBookDetails () {

		System.out.println("bookid          :"+ bookid);
		System.out.println("booktitle       :"+ booktitle);
		System.out.println("authorname      :"+ authorname);
		System.out.println("availablecopies :"+ availablecopies);
        
	}
	
	// method to display library details
	
	void displayLibraryDetails () {
		
		System.out.println("LibraryName     :"+ LibraryName);
		System.out.println("LibrarianName   :"+ LibrarianName);
	}
	
	// method to change librarian
	
	void changeLibrarian(String newLibrarian) {
		LibrarianName = newLibrarian;
	}
	

	public static void main(String[] args) {
		
		LibraryBook b1 = new LibraryBook();
		LibraryBook b2 = new LibraryBook();
		
		// object 1 details
		
		b1.bookid = 101;
		b1.booktitle = "Tenali Rama Krishna Stories";
		b1.authorname = "DurgaDevi";
		b1.availablecopies = 50;
		
		// object 2 details
	
		b2.bookid = 102;
		b2.booktitle = "LifeStories";
		b2.authorname = "LakshmiSrinivas";
		b2.availablecopies = 100;
		
		// displaying book 1 details 
		System.out.println("******BOOK DETAILS 1**********");
		b1.displayBookDetails();
		b1.displayLibraryDetails();
		
		// displaying book 2 details
		
		System.out.println("******BOOK DETAILS 2**********");
		b2.displayBookDetails();
		b2.displayLibraryDetails();
		
		
		// change librarian 
		b1.changeLibrarian("Manju");
		
		System.out.println("After Changing Librarian Name");
		
		b1.displayLibraryDetails();

	}

}
