package com.assignment.second.program;

abstract class Instrument {

	abstract void play();

}

class Piano extends Instrument {

	void play() {

		System.out.println("Piano is playing tan tan tan tan");

	}

}

class Flute extends Instrument {

	void play() {

		System.out.println("Flute is playing toot toot toot toot");

	}

}

class Guitar extends Instrument {

	void play() {
		System.out.println("Guitar is playing tin tin tin");

	}

}

class InstrumentInstances {

	public static void main(String args[]) {

		Instrument[] instance = new Instrument[10];

		instance[0] = new Piano();
		instance[1] = new Guitar();
		instance[2] = new Flute();
		instance[3] = new Flute();
		instance[4] = new Guitar();
		instance[5] = new Piano();

		for (int i = 0; i < 5; i++) {

			if (instance[i] instanceof Piano) {
			}

			instance[i].play();

		}

	}

}
