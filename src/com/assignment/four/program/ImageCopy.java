package com.assignment.four.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;

/**
 * A class that copies the image file from source to destination.
 * 
 * @author umesh
 *
 */

public class ImageCopy {

	public static void main(String[] args) throws IOException {

		File source = new File("/Java Assignments/resources/google.jpg");
		File destination = new File("/Java Assignments/resources/index.jpg");
		if (source.exists()) {
			if (destination.exists()) {
				System.out.println(" If You want to Rewrite press 1");
				InputStreamReader press = new InputStreamReader(System.in);
				if (press.read() == '1') {
					copyImage(source, destination);

				} else {
					System.out.println("Output File cant be Over write");
				}

			} else {
				System.out.println("Output file is not found in the path");
				destination.createNewFile();
				if (destination.exists()) {
					System.out.println("Output file is created");
				}
				copyImage(source, destination);
			}

		} else {
			System.out.println("Input File is not existed in path");
			return;
		}
	}

	/**
	 * This method is used to copy the image file from source to destination..
	 * File channel is used to do so.
	 * 
	 * @param source
	 * @param destination
	 * @throws IOException
	 */

	@SuppressWarnings("resource")
	private static void copyImage(File source, File destination) throws IOException {

		FileChannel inputFile = null;
		FileChannel outputFile = null;

		try {
			inputFile = new FileInputStream(source).getChannel();
			outputFile = new FileOutputStream(destination).getChannel();
			long count = 0;
			long size = inputFile.size();
			while ((count += outputFile.transferFrom(inputFile, count, size - count)) < size)
				;

			System.out.println("Image copies successfully");

		} catch (IOException e) {
			System.out.println("File not Found");
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
