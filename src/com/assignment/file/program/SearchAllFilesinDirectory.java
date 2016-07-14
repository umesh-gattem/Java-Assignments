package com.assignment.file.program;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author umesh
 * 
 *         Accept a directory name in form of String from user using proper IO
 *         stream. Store it in a variable. Search if it exists in your system.
 *         If it exists then show all the files present in the directory
 *         otherwise print the message that directory Does not Exists
 */

public class SearchAllFilesinDirectory {

	public static void main(String[] args) {
		isDirectoryExistsinSystem();

	}

	/**
	 * Method to find all files present in given Directory
	 * 
	 * @param outputFile
	 */

	private static void findAllFilesinDirectory(File outputFile) {
        File[] filesList = outputFile.listFiles();
        System.out.println("Files in the given directory are : ");
        for (File file : filesList){
            System.out.println(file.getName());
        }
	}

	/**
	 * 
	 * Method to find whether directory present in system or not.
	 * 
	 */

	private static void isDirectoryExistsinSystem() {
		System.out.println("Enter the string as directory: ");
		Scanner scan = new Scanner(System.in);
		String directory = scan.nextLine();
		File outputFile = new File(directory);
		if (outputFile.exists()) {
			System.out.println("Directory exists in the system: ");
			findAllFilesinDirectory(outputFile);

		} else {
			System.out.println("Enter directory didn't present .");
		}
		scan.close();

	}

}
