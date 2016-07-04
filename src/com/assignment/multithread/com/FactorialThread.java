package com.assignment.multithread.com;

/**
 * A class which handles thread which calculates the factorial of the number
 * 
 * @author umesh
 * 
 * @since 04-07-2016
 *
 */

public class FactorialThread implements Runnable {
	Thread factorialThread;
	public static volatile boolean isRunning = true;

	public void start() {
		factorialThread = new Thread(this);
		factorialThread.start();
	}

	
	public void run() {
		while (isRunning == true) {
			if (ThreadWhichReadsFile.arrayofInteger.size() == 0)
				continue;
			int k = ThreadWhichReadsFile.arrayofInteger.removeFirst();
			int fact = 1;
			for (int i = 1; i <= k; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + k + " is " + fact);
			System.out.println("running");

		}
	}
}
