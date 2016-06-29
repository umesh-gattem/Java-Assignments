package com.assignment.one.program;

/**
 * Class Book which describes its Book_title and Book_price. Use getter and
 * setter methods to get & set the Books description.
 * 
 * @author umesh
 *
 */

public class Book {

	String bookTitle;
	double bookPrice;

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	/**
	 * 
	 * @param args
	 * 
	 *            This is main function which contains two methods createbooks
	 *            and showbooks.
	 */
	public static void main(String args[]) {
		Book[] bookArray = new Book[4];
		for (int i = 0; i < bookArray.length; i++)
			bookArray[i] = new Book();
		createBooks(bookArray);
		showBooks(bookArray);
	}

	/**
	 * 
	 * @param bookArray
	 * 
	 *            This method displays the Book details like title and price
	 */

	private static void showBooks(Book[] bookArray) {
		System.out.println("Book title		Book price");
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print(bookArray[i].getBookTitle());
			System.out.println("		"+bookArray[i].getBookPrice());
		}
	}

	/**
	 * 
	 * 
	 * @param bookArray
	 * 
	 * This function will create 4 objects of the book ans set their details.
	 */

	private static void createBooks(Book[] bookArray) {
		System.out.println(bookArray.length);
		bookArray[0].setBookTitle("Java Programming");
		bookArray[0].setBookPrice(352.50);
		bookArray[1].setBookTitle("C programming");
		bookArray[1].setBookPrice(200.2);
		bookArray[2].setBookTitle("Networking");
		bookArray[2].setBookPrice(126.25);
		bookArray[3].setBookTitle("Data Structures");
		bookArray[3].setBookPrice(150);
	}
}
