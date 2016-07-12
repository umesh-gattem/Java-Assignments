package com.assignment.priorityQueue.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Here is the main declaration of the Priority Queue where operations are
 * called from this function. It maintains do while loop which tells the user to
 * perform operations like inserting the task,removing the task and printing all
 * tasks based upon on the choice selected by user.
 * 
 * @author umesh
 * 
 * @since 12-07-2016
 *
 */

public class MainProgram {

	public static void main(String[] args) throws IOException {

		Logger LOGGER = Logger.getLogger(MainProgram.class);
		Scanner scan = new Scanner(System.in);
		LOGGER.info("Enter the size of the Queue");
		int maxSize = scan.nextInt();
		PriorityQueue queue = new PriorityQueue(maxSize);
		LOGGER.info("Priority Queue is started");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		do {
			LOGGER.info("Select one option :");
			LOGGER.info("1. Insert Task\t 2.Remove Task\t 3.Print All tasks ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				LOGGER.info("Enter Task name and Priority:");
				String taskName = br.readLine();
				int priority = scan.nextInt();
				queue.insertTask(taskName, priority);
				break;
			case 2:
				queue.removeTask();
				break;
			case 3:
				queue.printAllTasks();
				break;
			default:
				LOGGER.info("Select correct choice");
				break;
			}
			LOGGER.info("Select y for continue");
			String str = br.readLine();
			ch = str.charAt(0);
		} while (ch == 'Y' || ch == 'y');
		LOGGER.info("Program ended");
		scan.close();
	}

}
