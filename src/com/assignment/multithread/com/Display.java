package com.assignment.multithread.com;

/**
 * A class named Display which contains display member function to print the
 * message of the Thread.
 * 
 * @author umesh
 * 
 * @since 04-07-2016
 *
 */

public class Display {

	public synchronized void showMessage(String message) {
		System.out.println("(");
		System.out.println(message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		System.out.println(")");

	}
}
