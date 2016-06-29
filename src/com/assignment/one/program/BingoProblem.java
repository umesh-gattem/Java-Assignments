package com.assignment.one.program;

/**
 * Program that accepts two numbers in the range from 1 to 40 from the Command
 * Line. It then compares these numbers against a single dimension array of five
 * integer elements ranging in value from 1 to 40. The program displays the
 * message BINGO if the two inputted values are found in the array element.
 * 
 * @author umesh
 *
 */

public class BingoProblem {
	
	/**
	 * 
	 * @param args
	 * 
	 * This is the main function that takes the arguments from command line.
	 * 
	 */

	public static void main(String args[]) {
		if(args.length==0){
			System.out.println("Enter the two integers in the Command line");
		}
		int firstInt = Integer.parseInt(args[0]);
		int secondInt = Integer.parseInt(args[1]);
		int array[] = { 1, 15, 26, 3, 29 };
		if (firstInt >= 1 && firstInt <= 40 && secondInt >= 1 && secondInt <= 40) {
			checkWhetherArgumentsPresentinArray(firstInt,secondInt,array);
		}
		else {
			System.out.println("Enter intergers between 1 and 40 in command arguments");
		}
	}
	
	/**
	 * 
	 * @param firstInt
	 * @param secondInt
	 * @param array
	 * 
	 * This method checks whether the arguments given in command line are present in array or not.
	 * 
	 */

	private static void checkWhetherArgumentsPresentinArray(int firstInt, int secondInt, int[] array) {
		int count = 0;
		System.out.println("Your First number is :" + firstInt);
		System.out.println("Your Second number is :" + secondInt);
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 1 && array[i] <= 40) {
				if (array[i] == firstInt || array[i] == secondInt)
					count++;

			} else {
				System.out.println("You entered array elements not between 1 and 40");
				return;
			}
		}
		if (count == 2) {
			System.out.println("Its BINGO!");
		} else {
			System.out.println("Its Not Found");
		}
	}
}
