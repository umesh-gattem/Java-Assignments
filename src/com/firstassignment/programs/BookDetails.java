package com.firstassignment.programs;

import java.awt.print.Book;
import java.util.Scanner;

public class BookDetails {

	String Book_title;
	double Book_price;
	

	public void set_price(double price) {
		Book_price = price;
	}

	public void set_title(String title) {
		Book_title = title;
	}

	public void get_title() {

		System.out.print(Book_title);

	}

	public void get_price() {
		
		String indent="         ";

		System.out.println(indent+Book_price);

	}

	public static void main(String args[]) {

		BookDetails[] BookArray = new BookDetails[4];
		
		
		for(int i=0;i< BookArray.length;i++)
			BookArray[i] = new BookDetails();

		// BookDetails book1 = new BookDetails();
		//
		// book1.set_title("Java Programming");
		//
		// book1.set_price(352.50);
		//
		// book1.get_title();
		//
		// book1.get_price();

		

		createBooks(BookArray);
		
		showBooks(BookArray);

	}

	private static void showBooks(BookDetails[] bookArray) {

		System.out.println("Book title                   Book price");

		for (int i = 0; i < bookArray.length; i++) {

			bookArray[i].get_title();
			bookArray[i].get_price();

		}
	}

	private static void createBooks(BookDetails[] bookArray) {
		
		System.out.println(bookArray.length);

		bookArray[0].set_title("Java Programming");

		bookArray[0].set_price(352.50);

		bookArray[1].set_title("C programming");

		bookArray[1].set_price(200.2);
		
		bookArray[2].set_title("Networking");

		bookArray[2].set_price(126.25);
		
		bookArray[3].set_title("Data Structures");

		bookArray[3].set_price(150);

	}

}
