package com.assignment.one.program;

/**
 * 
 * @author umesh
 * 
 *         Program that accepts two numbers from the Command Line and prints
 *         them out. Then use a for loop to print the next 13 numbers in the
 *         sequence where each number is the sum of the previous two.
 *
 */

public class SumofPreviousTwoIntegers {

	/**
	 * 
	 * @param args
	 * 
	 * This main function takes two integers from the command line.
	 * 
	 */
	public static void main(String args[]) {
		if(args.length==0){
			System.out.println("Oops! You didn't entered intergers in the command line");
			return;
		}
		int firstInt = Integer.parseInt(args[0]);
		int secondInt = Integer.parseInt(args[1]);
		int result;
		System.out.println("Command line arguments are :"+firstInt + "  " + secondInt + "  ");
		System.out.print("Next series of intergers are: ");
		for (int i = 0; i < 13; i++) {
			result = firstInt + secondInt;
			System.out.print(result + "  ");
			firstInt = secondInt;
			secondInt = result;
		}
	}
}
