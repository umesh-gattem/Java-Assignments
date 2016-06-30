package com.assignment.four.program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * A class CallDetailsRecord with the following members: A_Number, B_Number,
 * duration calculated Charge. A program which will accept the A_Number,
 * B_Number and duration of Call from user(Duration is in minutes). Rate that
 * call using 1 Rupee per min rate and store the calculated charge in
 * “calculatedCharge.txt” file.
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 *
 */

public class CallDetailsRecord {
	static int durationofCall;
	static long firstPersonNumber;
	static long secondPersonNumber;
	static int duration=100;

	public static void main(String[] args) {
		readDetailsofCall();
		printdetailsofCall();
		String outputFile = "/home/umesh/Documents/calculateCharge.txt";
		copyCalculatedChargeintoFile(durationofCall, outputFile);

	}

	/**
	 * 
	 * This method prints the Call details like both person phone number and
	 * duration of call and charge of the call
	 * 
	 */
	private static void printdetailsofCall() {
		System.out.println("First Person Number is : " + firstPersonNumber);
		System.out.println("Second Person Number is : " + secondPersonNumber);
		System.out.println("Duration of the call is: " + durationofCall);
		System.out.println("Calculated charge is : " + durationofCall);
	}

	/**
	 * This is method to copy the calculated charge into the file
	 * calculatedCharge.txt
	 * 
	 * @param durationofCall
	 * @param args
	 */

	private static void copyCalculatedChargeintoFile(int durationofCall, String outputFile) {
		try {
			BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(outputFile));
			String duration=Integer.toString(durationofCall);
			bufferwriter.write(duration);
			bufferwriter.close();
			System.out.println("Calculated charge is copied to output file ");
		} catch (IOException e) {
			System.out.println("File not found in the Directory");
		}
	}

	/**
	 * This is the method that reads the call details from the user using the
	 * Scanner function
	 * 
	 */

	private static void readDetailsofCall() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the A's number: ");
		firstPersonNumber = scan.nextLong();
		System.out.println("Enter the B's number: ");
		secondPersonNumber = scan.nextLong();
		System.out.println("Enter the duration of the call: ");
		durationofCall = scan.nextInt();
		calculateChargeofCall();
		scan.close();
	}

	/**
	 * This is the method which return the calculated charge .
	 * 
	 * @return
	 */

	public static int calculateChargeofCall() {
		return durationofCall;

	}

}
