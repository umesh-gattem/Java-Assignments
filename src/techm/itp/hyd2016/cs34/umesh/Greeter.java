package techm.itp.hyd2016.cs34.umesh;

/**
 * 
 * @author umesh
 * 
 *         A Greeter class with attributes: name string 
 *         Member functions: Greeter(aName) , sayHello(), sayGoodBye()
 */

public class Greeter {
	String name;

	public Greeter(String name) {
		super();
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello, " + name + "!");
	}

	public void sayGoodBye() {
		System.out.println("Good Bye, " + name + "!");

	}

}
