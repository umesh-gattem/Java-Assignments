package techm.itp.hyd2016.cs34.umesh;

/**
 * 
 * @author umesh
 * 
 *         A Advisor class with attributes: message string[5] Member
 *         functions:Advisor, getAdvice.
 *
 */

public class Advisor {
	String[] message = new String[5];

	/**
	 *        This is default constructor to initialize an array of strings with
	 *        atleast five advice messages
	 */

	public Advisor() {
		message[0] = "Never Say No";
		message[1] = "Keep working Hard";
		message[2] = "Don't waste time";
		message[3] = "Enjoy the life by doing work";
		message[4] = "Try Hard untill you get solution";
	}

	public void getAdvice(int randInt) {
		System.out.println("Advice :" + message[randInt]);

	}

}
