package com.assignment.multithread.com;

/**
 * A class which handles the thread to compute fibonacci series of 10 numbers.
 * 
 * @author umesh
 * 
 * @since 01-07-2016
 *
 */

public class FibonacciThread extends Thread {
	Thread fibonacciThread;

	public void start() {
		fibonacciThread = new Thread(this);
		fibonacciThread.start();
	}

	public void run() {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.println("Fibonacci series upto 10 numbers: ");
		System.out.print(firstNumber + "  " + secondNumber +"  ");
		for (int i = 0; i < 10; i++) {
			int result = firstNumber + secondNumber;
			System.out.print(result + "  ");
			firstNumber = secondNumber;
			secondNumber = result;
		}

	}

}
