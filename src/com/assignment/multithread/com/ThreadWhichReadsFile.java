package com.assignment.multithread.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * This class handles the thread will read a text file (Number.txt) containing
 * five positive integers one on each line.
 * 
 * @author umesh
 * 
 * @since 04-07-2016
 *
 */

public class ThreadWhichReadsFile extends Thread {
	Thread fileReaderThread;
	public static LinkedList<Integer> arrayofInteger = new LinkedList<>();
	FactorialThread factThread = new FactorialThread();

	public void start() {
		fileReaderThread = new Thread(this);
		fileReaderThread.start();
	}

	public void run() {
		String file = "../Java Assignments/resources/number.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			int c = 0;
			while ((line = br.readLine()) != null) {
				c = Integer.parseInt(line.trim());
				arrayofInteger.add(c);
			}
			
			br.close();
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

}
