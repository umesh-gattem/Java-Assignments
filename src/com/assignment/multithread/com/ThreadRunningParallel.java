package com.assignment.multithread.com;

/**
 * The class which creates different threads with different priorities and finding out
 * the execution time of each threads.
 * 
 * @author umesh
 * 
 * @since 01-07-2016
 *
 */

public class ThreadRunningParallel {
	public static void main(String args[]) {
		ThreadPriority highThread = new ThreadPriority(Thread.NORM_PRIORITY + 4);
		ThreadPriority lowThread = new ThreadPriority(Thread.NORM_PRIORITY - 4);
		ThreadPriority lowThreadTwo = new ThreadPriority(Thread.NORM_PRIORITY - 3);
		ThreadPriority lowThreadThree = new ThreadPriority(Thread.NORM_PRIORITY - 2);
		ThreadPriority lowThreadFour = new ThreadPriority(Thread.NORM_PRIORITY - 1);
	
		
		highThread.start();
		lowThread.start();
		lowThreadTwo.start();
		lowThreadThree.start();
		lowThreadFour.start();

	
		try {
			highThread.t.join();
			lowThread.t.join();
			lowThreadTwo.t.join();
			lowThreadThree.t.join();
			lowThreadFour.t.join();
			
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		System.out.println("Execution Time of Low-priority thread one is: " + lowThread.totalTime + "  Milliseconds");
		System.out.println("Execution Time of Low-priority thread two is: " + lowThreadTwo.totalTime + "  Milliseconds");
		System.out.println("Execution Time of Low-priority thread three is: " + lowThreadThree.totalTime + "  Milliseconds");
		System.out.println("Execution Time of Low-priority thread four is: " + lowThreadFour.totalTime + "  Milliseconds");
		System.out.println("Execution Time of High-priority thread is : " + highThread.totalTime + "  Milliseconds");
	}
}