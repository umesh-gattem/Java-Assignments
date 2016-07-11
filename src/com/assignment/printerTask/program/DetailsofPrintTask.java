package com.assignment.printerTask.program;

import java.util.LinkedList;

import org.apache.log4j.Logger;

public class DetailsofPrintTask {

	private static Logger LOGGER = Logger.getLogger(DetailsofPrintTask.class);

	public void updateRemainPages(TaskDetail task, int updatePages) {
		task.noofPages = updatePages;
	}

	public void updateWaitTime(TaskDetail task, LinkedList<Object> taskList) {
		for (int i = 0; i <= taskList.size(); i++) {
			if (taskList.get(i) == task) {
				LOGGER.info(task.executiontime);
				return;
			} else {

			}
		}
	}
}
