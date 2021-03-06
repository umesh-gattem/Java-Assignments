package com.assignment.multithread.com;

/**
 * A class which implements the Runnable class to perform multithreading and
 * executing the two threads with different priorities by making high priority
 * thread to sleep so that low priority thread can execute first.
 * 
 * @author umesh
 * 
 * @since 01-06-2016
 *
 */

public class SleepThread extends Thread {
	long startTime;
	long endTime;
	long totalTime;
	Thread t;

	/**
	 * A method which sets the priorities of the threads.
	 * 
	 * @param p
	 */

	public SleepThread(int p) {
		t = new Thread(this);
		t.setPriority(p);
		System.out.println("Thread is " + t.getName() + "   " + "Priority is " + t.getPriority());
	}

	/**
	 * A method run() to process the thread. Here high priority thread is made
	 * sleep such that low priority thread execute first
	 * 
	 */
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int j = 0;
		while (j < 10000) {
			for (int i = 0; i < 30; i++) {
			}
			j++;
		}
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println("End time for : " + t.getName() + "    " + endTime);
	}

	/**
	 * A method start() to start the thread execution.
	 * 
	 */

	public void start() {
		startTime = System.currentTimeMillis();
		System.out.println("start time for  " + t.getName() + "      " + startTime);
		t.start();
	}
}
