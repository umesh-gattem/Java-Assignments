package com.assignment.multithread.com;

/**
 * A Class that handles with thread Counter that starts counting from 0
 * (0,1,2,3…) and stores each value in the Storage class.
 * 
 * @author umesh
 * 
 * @since 04-07-2016
 *
 */

public class Counter extends Thread {
	

	public void run() {
		System.out.println("Counter started");
		int count = 0;
		for (int i = 0; i < 3000; i++) {
			Storage.arrayofInteger[i] = count++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("-------Counter is finished------");
	}
}
