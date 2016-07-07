package com.assignment.multithread.com;

/**
 * This is the main function for creating three threads ..
 * 
 * @author umesh
 * 
 * @since 04-07-2016
 *
 */

public class MainFunction {

	public static void main(String[] args) {

		Display display = new Display();

		new ThreadMessage("Hello", display);
		new ThreadMessage("Beautiful", display);
		new ThreadMessage("World", display);

	}

}
