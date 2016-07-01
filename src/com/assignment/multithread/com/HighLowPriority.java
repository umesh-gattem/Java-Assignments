package com.assignment.multithread.com;

/**
 * The class which creates two threads with different priorities and finding out
 * the execution time of each threads.
 * 
 * @author umesh
 * 
 * @since 01-07-2016
 *
 */

public class HighLowPriority {
	public static void main(String args[]) {
		/**
		 * Use ThreadPriority object if you want to execute both Threads with
		 * out keeping high priority thread in sleep. otherwise use SleepThread
		 * object to make high priority Thread sleep.
		 */
	//	ThreadPriority highThread = new ThreadPriority(Thread.NORM_PRIORITY + 2);
		SleepThread highThread = new SleepThread(Thread.NORM_PRIORITY + 2);
		ThreadPriority lowThread = new ThreadPriority(Thread.NORM_PRIORITY - 2);
		lowThread.start();
		highThread.start();
		try {
			highThread.t.join();
			lowThread.t.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println("Execution Time of Low-priority thread is: " + lowThread.totalTime + "  Milliseconds");
		System.out.println("Execution Time of High-priority thread is : " + highThread.totalTime + "  Milliseconds");
	}
}