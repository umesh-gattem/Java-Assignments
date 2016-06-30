package esg.itp.shape;

/**
 * 
 * An interface Polygon containing the members : area float, perimeter float
 * Member functions: void calcArea( ); void calcPeri( ); void display( ); of the
 * given polygon
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 * 
 * 
 * 
 *
 */

public interface Polygon {
	float areaofShape = 0;
	float perimeter = 0;

	void calculateArea();

	void calculatePerimeter();

	void display();

}
