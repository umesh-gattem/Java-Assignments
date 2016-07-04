package com.assignment.multithread.com;

public class TestMain {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Printer printer = new Printer();
		counter.start();
		printer.start();
	}
}
