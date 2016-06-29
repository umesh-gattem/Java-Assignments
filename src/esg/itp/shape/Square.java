package esg.itp.shape;

/**
 * 
 * @author umesh
 * 
 *         A class Square that implements Polygon and has the following
 *         member:side float, Square(float s);
 *
 */

public class Square implements Polygon {
	float side;
	float areaofSquare;
	float perimeterofSquare;

	public Square(float side) {
		super();
		this.side = side;
	}

	public void calculateArea() {
		areaofSquare = side * side;

	}

	public void calculatePerimeter() {
		perimeterofSquare = 4 * side;
	}

	public void display() {
		System.out.println("Area of Square is : " + areaofSquare);
		System.out.println("Perimeter of Square is : " + perimeterofSquare);

	}

}
