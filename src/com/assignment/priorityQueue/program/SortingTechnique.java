package com.assignment.priorityQueue.program;

import java.util.ArrayList;

public class SortingTechnique {

	public void sort(ArrayList<TaskDetail> taskList, TaskDetail newTask) {
		int size = taskList.size();
		if (taskList.size() == 1) {
			return;
		}
		if (taskList.size() == 2) {
			sortTwoElements(taskList);
			return;
		} else if (newTask.priority > taskList.get(size - 2).priority) {
			return;
		} else if (newTask.priority < taskList.get(0).priority) {
			sortElements(0, size - 1, taskList, newTask);
		}
		int lowIndex = 0;
		int highIndex = size - 2;
		binarySort(lowIndex, highIndex, taskList, newTask);
	}

	private void sortElements(int lowIndex, int highIndex, ArrayList<TaskDetail> taskList, TaskDetail newTask) {

	}

	public void sortTwoElements(ArrayList<TaskDetail> taskList) {
		if (taskList.get(0).priority < taskList.get(1).priority) {
			return;
		} else {
			TaskDetail temp = taskList.get(0);
			taskList.set(0, taskList.get(1));
			taskList.set(1, temp);
		}
		return;
	}

	public void binarySort(int lowIndex, int highIndex, ArrayList<TaskDetail> taskList, TaskDetail newTask) {
		if (lowIndex + 1 == highIndex || lowIndex == highIndex) {
			int index;
			if (taskList.get(highIndex).priority < newTask.priority) {
				index = highIndex + 1;
			} else if (taskList.get(lowIndex).priority < newTask.priority) {
				index = highIndex;
			} else {
				index = lowIndex;
			}
			TaskDetail temp = taskList.get(index);
			taskList.set(index, newTask);
			for (int i = index + 1; i + 1 < taskList.size(); i++) {
				TaskDetail tempTask=taskList.get(i+1);
				taskList.set(i + 1, taskList.get(i));
				
			}
			taskList.set(index + 1, temp);
			return;
		}
		int mid = (lowIndex + highIndex) / 2;
		if (taskList.get(mid).priority < newTask.priority) {
			lowIndex = mid + 1;
			binarySort(lowIndex, highIndex, taskList, newTask);
		} else if (taskList.get(mid).priority > newTask.priority) {
			highIndex = mid - 1;
			binarySort(lowIndex, highIndex, taskList, newTask);
		}

	}

}
