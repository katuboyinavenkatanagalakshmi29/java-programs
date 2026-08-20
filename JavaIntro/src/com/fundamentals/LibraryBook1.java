package com.fundamentals;

public class LibraryBook1 {
	
	static String libraryName = "MANJU LIBRARY";
	static String librarianName = "MANJULA";
	
	int bookid;
	String bookTitle;
	String authorName;
	int availableCopies;
	
	void displaybookissue () {
		availableCopies--;
	}
	
	
	static void displayLibrary() {
		System.out.println(libraryName);
		System.out.println(librarianName);
		
	}
	
	void displayBookDetails() {
		
		System.out.println(bookid);
		System.out.println(bookTitle);
		System.out.println(authorName);
		System.out.println(availableCopies);
	}
	
	static void ChangeLibrarian() {
		librarianName = "LAXMI";
	}
	
	

	public static void main(String[] args) {
		
		displayLibrary();
		
		LibraryBook1 l = new LibraryBook1();
		LibraryBook1 l1 = new LibraryBook1();
		
		System.out.println("*************************************");
		
		l.bookid = 101;
		l.bookTitle = "Honesty is the best policy";
		l.authorName = "LakshmiSrinivas";
		l.availableCopies = 5;
		
		l.displayBookDetails();
		
		System.out.println("*************************************");
		
		l1.bookid = 102;
		l1.bookTitle = "Honesty";
		l1.authorName = "LakshmiSrinivas";
		l1.availableCopies = 3;
		
		l1.displayBookDetails();
		
		l.displaybookissue();
		l1.displaybookissue();
		
		System.out.println("after issuing:");
		
		l.displayBookDetails();
		l1.displayBookDetails();
		
		ChangeLibrarian();
		
		System.out.println("after changing librarian:");
		
		displayLibrary();
		
		
		
		
		

	}

}
