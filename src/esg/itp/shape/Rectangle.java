package esg.itp.shape;

/**
 * 
 * @author umesh
 * 
 *         A class Rectangle that implements Polygon and has the following length
 *         float breadth float Rectangle(flaot length, float breadth);
 *
 */

public class Rectangle implements Polygon {
	float lengthofRectangle;
	float breadthofRectangle;
	float areaofRectangle;
	float perimeterofRectangle;

	public Rectangle(float lengthofRectangle, float breadthofRectangle) {
		super();
		this.lengthofRectangle = lengthofRectangle;
		this.breadthofRectangle = breadthofRectangle;
	}

	public void calculateArea() {
		areaofRectangle = lengthofRectangle * breadthofRectangle;
	}

	public void calculatePerimeter() {
		perimeterofRectangle = 2 * (lengthofRectangle + breadthofRectangle);
	}

	public void display() {
		System.out.println("Area of Rectangle is : " + areaofRectangle);
		System.out.println("Perimeter of reactangle is : " + perimeterofRectangle);
	}

}
