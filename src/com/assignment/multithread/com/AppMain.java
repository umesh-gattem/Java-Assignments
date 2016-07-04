package com.assignment.multithread.com;

/**
 * A class which creates two threads where one thread takes the file input from
 * the command line and another thread does operation on that file
 * 
 * @author umesh
 * 
 * @since 04-07-2016
 *
 */

public class AppMain {

	public static void main(String[] args) {
		ThreadWhichReadsFile firstThread = new ThreadWhichReadsFile();
		firstThread.start();
		FactorialThread factThread = new FactorialThread();
		factThread.start();
	}
}
