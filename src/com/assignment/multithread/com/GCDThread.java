package com.assignment.multithread.com;

/**
 * A class which handles the thread to implement GCD of two numbers.
 * 
 * @author umesh
 * 
 * @since 01-07-2016
 *
 */

public class GCDThread extends Thread {
	Thread gcdofTwoNumberThread;

	public void start() {
		gcdofTwoNumberThread = new Thread(this);
		gcdofTwoNumberThread.start();
	}

	public void run() {
		int firstNumber = 36, secondNumber = 16, remainder;
		while (firstNumber % secondNumber != 0) {
			remainder = firstNumber % secondNumber;
			firstNumber = secondNumber;
			secondNumber = remainder;
		}
		System.out.println("\nGCD of two numbers is : " + secondNumber);
	}
}
