package com.corejava;

public class Library {
	
	static int totalLibraries = 0;
	
	String BookName;
	
	public Library (String BookName) {
		this.BookName = BookName;
		totalLibraries++;
	}
	
		void display() {
			System.out.println("BookName:"+ this.BookName);
		}
		

	public static void main(String[] args) {
		
		Library L1 = new Library("Lib");
		
		L1.display();
		
		System.out.println("Total Books: " + totalLibraries);
	 
	}

}
