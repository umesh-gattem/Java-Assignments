package com.assignment.file.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author umesh
 * 
 *         A program to copy a file from source to destination..
 *         Source file is given in command line argument.
 *
 */

public class FileCopy {

	public static void main(String[] args) throws IOException {

		FileInputStream inputFile = null;
		FileOutputStream outputFile = null;
		try {
			inputFile = new FileInputStream(args[0]);
			outputFile = new FileOutputStream("/home/umesh/Documents/output.txt");
			int c;
			while ((c = inputFile.read()) != -1) {
				outputFile.write(c);
			}
			System.out.println("File Copied Successfully");

		} catch (IOException e) {
			System.out.println("Input File is not found ");
		} finally {

			if (inputFile != null) {
				inputFile.close();
			}
			if (outputFile != null) {
				outputFile.close();
			}
		}

	}

}
