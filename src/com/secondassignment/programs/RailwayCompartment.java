package com.secondassignment.programs;

import java.util.Random;

abstract class Railways {

	abstract void notice();

}

class FirstClass extends Railways {

	void notice() {

		System.out.println("This is FirstClass compartment");

	}

}

class Ladies extends Railways {

	void notice() {

		System.out.println("This is Ladies compartment");

	}

}

class General extends Railways {

	void notice() {

		System.out.println("This is General compartment");

	}

}

class Luggage extends Railways {

	void notice() {

		System.out.println("This is Luggage  compartment");

	}

}

class RailwayCompartment {

	public static void main(String[] args) {

		Railways[] compartment = new Railways[10];

		for (int i = 0; i < 10; i++) {

			int randInt = randInt(1, 4);

			System.out.print(randInt + "    ");
			if (randInt == 1) {

				compartment[i] = new FirstClass();
				compartment[i].notice();

			}
			if (randInt == 2) {

				compartment[i] = new Ladies();
				compartment[i].notice();

			}
			if (randInt == 3) {

				compartment[i] = new General();
				compartment[i].notice();

			}
			if (randInt == 4) {

				compartment[i] = new Luggage();
				compartment[i].notice();

			}

		}


	}

	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
