package com.assignment.three.program;

import java.util.Scanner;

/**
 * 
 * @author umesh
 * 
 *         A class to calculate the average of first N natural numbers given N
 *         by user.
 *
 */

public class CalculateAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		double averageofFirstN = calculateAverage(number);
		System.out.println("average of First 10 numbers are :" + averageofFirstN);
	}

	/**
	 * 
	 * @param number
	 * @return
	 * 
	 * 		This is the method to calculate average .
	 */

	public static double calculateAverage(int number) {
		int sum = 0;
		double result;
		if (number < 0) {
			throw new IllegalArgumentException("You have not taken natural number");
		}

		else {
			for (int i = 1; i <=number; i++) {
				sum = sum + i;
			}
			result = sum / number;
		}

		return result;

	}

}
