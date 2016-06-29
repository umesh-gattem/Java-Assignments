package com.assignment.one.program;

import java.util.Scanner;

/**
 * 
 * @author umesh
 * 
 *         Program to list all even numbers less than or equal to the number n.
 *         Take the value of n as input from user.
 *
 */

public class EvenNumbersUptoGivenNumber {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		System.out.printf("Even Numbers upto number %d are:", number);
		for (int i = 2; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "   ");
			}
		}
		return;
	}
}
