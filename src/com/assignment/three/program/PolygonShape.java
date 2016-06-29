package com.assignment.three.program;

import esg.itp.shape.Polygon;
import esg.itp.shape.Rectangle;
import esg.itp.shape.Square;

/**
 * 
 * @author umesh
 * 
 *         a class that imports the above package an instantiates
 *         an object of the Square class and an object of the Rectangle class.
 *
 */

public class PolygonShape {

	public static void main(String[] args) {
		Polygon square = new Square((float) 4);
		Polygon rectangle = new Rectangle((float) 5, (float) 3);
		square.calculateArea();
		square.calculatePerimeter();
		square.display();
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
		rectangle.display();
	}

}
