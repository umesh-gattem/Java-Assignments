package com.assignment.file.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author umesh
 * 
 *         A program which will accept an input String from user Write the input
 *         in the file io.txt Show size of the file. Read contents from the file
 *         and display them on console Delete io.txt file using File class
 *
 */

public class ReadContentsFromFile {
	static BufferedReader bufferReader = null;
	static BufferedWriter bufferWriter = null;

	public static void main(String[] args) throws IOException {
		insertInputintoFile(args[0]);
		readContentsofFile(args[0]);
		getFileSize(args[0]);
		// deleteFile(args[0]);
	}

	/**
	 * 
	 * @param string
	 * 
	 *            Method displays the size of the file.
	 */

	private static void getFileSize(String string) {
		
		File outputFile=new File(string);
		System.out.println("Size of the file is : " +outputFile.length() +"  bytes");

	}

	/**
	 * 
	 * @param string
	 * @throws IOException
	 * 
	 *             Method to insert input into file.
	 */
	private static void insertInputintoFile(String string) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input String");
		String input = scan.nextLine();
		bufferWriter = new BufferedWriter(new FileWriter(string));
		bufferWriter.write(input);
		bufferWriter.close();
		scan.close();

	}

	/**
	 * 
	 * @param args
	 * 
	 *            Method to delete the file .
	 */

	private static void deleteFile(String args) {
		boolean success = new File(args).delete();
		if (success == true) {
			System.out.println("File is deleted successfully");
		}
	}

	/**
	 * 
	 * @param args
	 * @throws IOException
	 * 
	 *             Method to read contents from file and display.
	 */

	private static void readContentsofFile(String args) throws IOException {
		bufferReader = new BufferedReader(new FileReader(args));
		String contentsofFile = "", line = null;
		while ((line = bufferReader.readLine()) != null) {
			contentsofFile += line;
		}
		System.out.println("Contents of the File are : " + contentsofFile);
	}

}
