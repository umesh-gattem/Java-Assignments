package com.assignment.four.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author umesh
 * 
 *         A program which take source file and destination file as input as
 *         command line arguments.It copies the source file contents to
 *         destination file. If source file does not exist, it should give
 *         appropriate message to use. If destination file does not exist, it
 *         should be created. If it exists,program should ask that, “whether you
 *         want to overwrite?(Yes/No”.
 *
 */

public class FileCopyIfFileEXists {

	public static void main(String[] args) throws IOException {

		File in = new File(args[0]);
		File out = new File(args[1]);
		if (in.exists()) {
			if (out.exists()) {
				System.out.println(" If You want to Rewrite press 1");
				InputStreamReader press = new InputStreamReader(System.in);
				if (press.read() == '1') {
					copyInputFiletoOutputFile(in, out);

				} else {
					System.out.println("Output File cant be Over write");
				}

			} else {
				System.out.println("Output file is not found in the path");
				out.createNewFile();
				if (out.exists()) {
					System.out.println("Output file is created");
				}
				copyInputFiletoOutputFile(in, out);
			}

		} else {
			System.out.println("Input File is not existed in path");
			return;
		}
	}

	/**
	 * 
	 * @param in
	 * @param out
	 * @throws IOException
	 * 
	 *             This is the method to copy the file from source to
	 *             destination
	 * 
	 */

	private static void copyInputFiletoOutputFile(File in, File out) throws IOException {
		FileInputStream inputFile = new FileInputStream(in);
		FileOutputStream outputFile = new FileOutputStream(out);
		int c;
		while ((c = inputFile.read()) != -1) {
			outputFile.write(c);
		}
		System.out.println("File copied successfully");
	}

}