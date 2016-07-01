package com.assignment.multithread.com;

/**
 * A class which contains two objects.One to find fibonacci series and another
 * one to find GCD of two numbers
 * 
 * @author umesh
 * 
 * @since 01-07-2016
 *
 */

public class GCDandFibonacci {

	public static void main(String[] args) {

		FibonacciThread fibonacci = new FibonacciThread();
		ThreadofGCD gcdofTwoNumber = new ThreadofGCD();
		fibonacci.start();
		gcdofTwoNumber.start();
		try {
			fibonacci.fibonacciThread.join();
			gcdofTwoNumber.gcdofTwoNumberThread.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
	}

}
