package com.assignment.multithread.com;

/**
 * This is the first thread with message "Hello".
 * 
 * @author umesh
 * 
 * @since 04-07-2016
 *
 */

public class ThreadMessage extends Thread {

	String message;
	Display disp;

	public ThreadMessage(String message, Display disp) {
		this.message = message;
		this.disp = disp;
		start();
	}

	public void run() {
//		synchronized (disp) {
			disp.showMessage(message);
//		}
	}

}
