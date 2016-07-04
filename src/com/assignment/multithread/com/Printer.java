package com.assignment.multithread.com;

/**
 * 
 * A class that handles the printer Thread that keeps reading the value in the
 * Storage class and printing it.
 * 
 * @author umesh
 *
 * @since 04-06-2016
 */

public class Printer extends Thread {
	

	public void run() {
		System.out.println("--------Printer is starting printing numbers----");
		for (int i = 0; i < 3000; i++) {
			System.out.println("value prints is  :" + Storage.arrayofInteger[i]);
		}
		System.out.println("--------Printer is finished printing numbers----");
	}
}
