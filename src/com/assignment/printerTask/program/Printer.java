package com.assignment.printerTask.program;

import java.util.LinkedList;

import org.apache.log4j.Logger;

import com.assignment.printerTask.program.TaskDetail;

public class Printer extends Thread {

	private static Logger LOGGER = Logger.getLogger(Printer.class);
	int count = 0;

	public float executeTask(String task, int pagesPrintPerMin, int noofPages) {
		LOGGER.info(task + " is started");
		float executionTime = (float) noofPages / (float) pagesPrintPerMin;
		LOGGER.info("Execution Time of " + task + " is " + executionTime + " minutes\n");
		count++;
		return executionTime;
	}

	public TaskDetail addTask(String taskName, int id, int noofPages) {
		TaskDetail task = new TaskDetail(taskName, id, noofPages);
		LOGGER.info(taskName + " is added\n");
		return task;
	}

	public void tasksRemain(LinkedList<Object> taskList) {
		int remainTask = taskList.size() - count;
		LOGGER.info("Tasks Remained are :" + remainTask);
	}

	public void removeTask(TaskDetail task, LinkedList<Object> taskList) {
		taskList.remove(task);
		LOGGER.info(task.taskName + " is removed");
	}
}
