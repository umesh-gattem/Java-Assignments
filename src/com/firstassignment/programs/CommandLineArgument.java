package com.firstassignment.programs;

public class CommandLineArgument {

	public static void main(String args[]) {

		System.out.println(args[0].length());

		System.out.println(args[0].toUpperCase());

		isStringPalindrome(args[0].toUpperCase());

	}

	private static void isStringPalindrome(String string) {

		int start = 0;
		int end = (string.length()) - 1;
		while (start < end) {

			if (string.charAt(start) != string.charAt(end)) {
				System.out.println("String is not pallindrome");
				return;
			}

			start++;
			end--;

		}
		System.out.println("String is pallindrome");

	}

}
