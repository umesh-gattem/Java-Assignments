package com.assignment.second.program;

import java.util.Random;

public class TestMedicine {
	
	public static void main(String[] args) {

		Medicine[] medicine = new Medicine[10];

		for (int i = 0; i < 10; i++) {

			int randInt = randInt(1, 3);

			System.out.print(randInt + "    ");
			if (randInt == 1) {

				medicine[i] = new Tablet();
				medicine[i].displayLabel();

			}
			if (randInt == 2) {

				medicine[i] = new Syrup();
				medicine[i].displayLabel();

			}
			if (randInt == 3) {

				medicine[i] = new Ointment();
				medicine[i].displayLabel();

			}
			

		}


	}

	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
