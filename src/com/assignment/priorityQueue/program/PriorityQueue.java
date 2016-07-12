package com.assignment.priorityQueue.program;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;

/**
 * 
 * Here is the Class PriorityQueue where different operations of the task is
 * mentioned. This class maintains the all the tasks in the ArrayList.
 * 
 * It has constructor to define the size of the queue.
 * 
 * @author umesh
 * @since 12-07-2016
 *
 */

public class PriorityQueue {
	int maxSize;
	private static Logger LOGGER = Logger.getLogger(PriorityQueue.class);
	ArrayList<TaskDetail> taskList = new ArrayList<TaskDetail>();

	public PriorityQueue(int maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * This is the method to insert or create the task by invoking the
	 * TaskDetail constructor. New task created will be added to the list and
	 * list is sorted by using Collections.sort() method.
	 * 
	 * @param taskName
	 * @param priority
	 */

	public void insertTask(String taskName, int priority) {
		if (isFull()) {
			LOGGER.info("Queue is Full");
		}

		TaskDetail newTask = new TaskDetail(taskName, priority);
		taskList.add(newTask);
		LOGGER.info(taskName + "  with priority  " + priority + "  is inserted");
		Collections.sort(taskList);
	}

	/**
	 * This is the method to check whether the Queue is empty or not.
	 * 
	 * If the list is empty then we can say that Queue is empty.
	 * 
	 * @return boolean
	 */

	public boolean isEmpty() {
		if (taskList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * This is the method to check whether the Queue is full or not.
	 * 
	 * If the list size is equal to maxSize of the Queue it returns true.
	 * 
	 * @return boolean
	 */

	public boolean isFull() {
		if (taskList.size() == maxSize) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * This method is used to print all the tasks in the queue.
	 * 
	 */

	public void printAllTasks() {
		if (isEmpty()) {
			LOGGER.info("Queue is empty");
		}
		LOGGER.info("Tasks present are:");
		for (int i = 0; i < taskList.size(); i++) {
			LOGGER.info(taskList.get(i).taskName + "\t\t" + taskList.get(i).priority);
		}
	}

	/**
	 * This method is used to remove the task at head point..i.e., the task with
	 * highest priority
	 * 
	 */

	public void removeTask() {
		if (isEmpty()) {
			LOGGER.info("Queue is empty");
		}
		LOGGER.info("Task  " + taskList.get(0).taskName + "is removed");
		taskList.remove(0);
	}

}
