package com.assignment.printerTask.program;

import java.util.LinkedList;
import java.util.Scanner;

public class MainProgram {

	public static LinkedList<Object> taskList = new LinkedList<Object>();

	public static void main(String[] args) {
		Printer printer = new Printer();
		System.out.println("Enter the number of pages to print per minute:");
		Scanner scan = new Scanner(System.in);
		int pagesPrintPerMin = scan.nextInt();
		TaskDetail task1 = new TaskDetail("Task 1", 1, 10);
		TaskDetail task2 = new TaskDetail("Task 2", 2, 10);
		TaskDetail task3 = new TaskDetail("Task 3", 3, 15);
		TaskDetail task4 = new TaskDetail("Task 4", 4, 20);
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		task1.executiontime = printer.executeTask(task1.taskName, pagesPrintPerMin, task1.noofPages);
		task2.executiontime = printer.executeTask(task2.taskName, pagesPrintPerMin, task2.noofPages);
		task3.executiontime = printer.executeTask(task3.taskName, pagesPrintPerMin, task3.noofPages);
		task4.executiontime = printer.executeTask(task4.taskName, pagesPrintPerMin, task4.noofPages);
		TaskDetail task5 = printer.addTask("Task 5", 5, 12);
		taskList.add(task5);
		task4.executiontime = printer.executeTask(task5.taskName, pagesPrintPerMin, task5.noofPages);
		printer.removeTask(task3, taskList);
		printer.removeTask(task5, taskList);
		scan.close();
	}

}
