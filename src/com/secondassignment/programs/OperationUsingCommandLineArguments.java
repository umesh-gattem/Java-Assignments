package com.secondassignment.programs;

public class OperationUsingCommandLineArguments {

	public static void main(String args[]) {

		int firstOperator = Integer.parseInt(args[0]);
		int secondOperator = Integer.parseInt(args[1]);

		char operator = args[2].charAt(0);
		int result = 0;

		if (operator == '+') {
			result = firstOperator + secondOperator;
		} else if (operator == '-') {
			result = firstOperator - secondOperator;
		} else if (operator == '*') {
			result = firstOperator * secondOperator;
		} else if (operator == '/') {
			result = firstOperator / secondOperator;
		} else {
			System.out.println("Enter the correct argument");
			return;
		}
		
		System.out.println(result);

	}

}
