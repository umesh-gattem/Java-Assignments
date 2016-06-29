package com.assignment.one.program;

/**
 * 
 * @author umesh
 * 
 *         Program that takes a String through Command Line argument and display
 *         the length of the string. Also display the string into uppercase and
 *         check whether it is a palindrome or not.
 *
 */

public class CommandLineArgument {

	/**
	 *
	 * This is the main function which takes arguments from command line..
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		if (args.length == 0) {
			System.out.println("Oops! You didn't entered String in the command line");
			return;
		}
		System.out.println("Length of the string is :" +args[0].length());
		System.out.println("Upper case of the string is :" +args[0].toUpperCase());
		isStringPalindrome(args[0].toUpperCase());

	}

	/**
	 * This method check whether the string is palindrome or not
	 * 
	 * @param string
	 */

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
