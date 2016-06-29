package com.assignment.three.program;

import techm.itp.hyd2016.cs34.umesh.Greeter;
import java.util.Random;
import techm.itp.hyd2016.cs34.umesh.Advisor;;

/**
 * 
 * @author umesh
 * 
 *         A class GreeterTest that constructs Greeter objects for all
 *         command-line arguments and prints out the results of calling
 *         sayHello().
 *
 */
public class GreeterTest {

	public static void main(String args[]) {
		Greeter[] person = new Greeter[5];
		Advisor advise = new Advisor();
		if (args.length == 0) {
			System.out.println("Enter the Greeter names as arguments in the command line");
			return;
		}

		for (int i = 0; i < args.length; i++) {
			person[i] = new Greeter(args[i]);
		}
		for (int i = 0; i < args.length; i++) {
			person[i].sayHello();
		}
		int randInt = randInt(0, 4);
		advise.getAdvice(randInt);
		for (int i = (args.length) - 1; i >= 0; i--) {
			person[i].sayGoodBye();
		}

	}
	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 * 
	 * This the random function that generates random integers between range as given by parameters
	 */

	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
