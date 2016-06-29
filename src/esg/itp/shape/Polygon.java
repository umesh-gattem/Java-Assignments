package esg.itp.shape;

/**
 * 
 * @author umesh
 * 
 *         An interface Polygon containing the members : area float, perimeter
 *         float Member functions: void calcArea( ); void calcPeri( ); void
 *         display( ); of the given polygon
 *
 */

public interface Polygon {
	float areaofShape = 0;
	float perimeter = 0;

	void calculateArea();

	void calculatePerimeter();

	void display();

}
