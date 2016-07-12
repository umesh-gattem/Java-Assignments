package com.assignment.priorityQueue.program;

/**
 * A class TaskDetail is used to create the task with its members taskName and
 * priority.
 * 
 * This class implements the Comparable Class to override the compareTo function
 * which is used to sort the tasks based on their priorities.
 * 
 * @author umesh
 * 
 * @since 12-07-2016
 *
 */

public class TaskDetail implements Comparable<TaskDetail> {
	String taskName;
	int priority;

	public TaskDetail(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(TaskDetail task) {
		int comparePriority = ((TaskDetail) task).getPriority();
		return this.priority - comparePriority;
	}

}
