package com.firstassignment.programs;

import java.util.Scanner;

public class EvenNumbersUptoGivenNumber {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();

		System.out.printf("Even Numbers upto number %d are:", number);

		for (int i = 2; i <= number; i++) {

			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		return;

	}

}
