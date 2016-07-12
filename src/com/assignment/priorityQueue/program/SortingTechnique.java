package com.assignment.priorityQueue.program;

import java.util.ArrayList;

public class SortingTechnique {
	private void sort(ArrayList<TaskDetail> taskList, TaskDetail newTask) {
		int size = taskList.size();
		int lowIndex = 0;
		int highIndex = size - 2;
		binarySort(lowIndex, highIndex, taskList, newTask);
	}

	private void binarySort(int lowIndex, int highIndex, ArrayList<TaskDetail> taskList, TaskDetail newTask) {
		if (taskList.size() == 2) {
			if (taskList.get(0).priority < taskList.get(1).priority) {
				return;
			} else {
				TaskDetail temp = taskList.get(0);
				taskList.set(0, taskList.get(1));
				taskList.set(1, temp);
			}

		}
		if (lowIndex + 1 == highIndex || lowIndex==highIndex) {
			int index;
			if (taskList.get(lowIndex).priority < newTask.priority) {
				index = highIndex;
			} else {
				index = lowIndex;
			}
			TaskDetail temp = taskList.get(index);
			taskList.set(index, newTask);
			for (int i = index + 1; i + 1 < taskList.size(); i++) {
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
