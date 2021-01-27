
/**
 * This class represents a triagnle made of points on a plane
 * 
 * @author Carter Clark
 */

import java.util.Arrays;

public class Triangle {

	/**
	 * Instance Variables: array is an array of Points with a length of 3 id is a
	 * unique integer that identifies a particular triangle idCounter will be used
	 * to increment id and give each object it's unique id
	 */
	private Point[] array = new Point[3];
	private int id;
	private static int idCounter = 1;

	/**
	 * A constructor for the Triangle class
	 * 
	 * @param point1, an object of type point that makes up the triangle
	 * @param point2, an object of type point that makes up the triangle
	 * @param point3, an object of type point that makes up the triangle
	 */
	public Triangle(Point point1, Point point2, Point point3) {
		array[0] = point1;
		array[1] = point2;
		array[2] = point3;
		this.id = idCounter++;
	}

	/**
	 * Another constructor for the Triangle class
	 * 
	 * @param p, an object of type point that makes up one point of the triangle The
	 *           other points of the triangle will be made null
	 */
	public Triangle(Point point) { // change to Point point
		this(point, null, null);
	}

	/**
	 * A no argument constructor for the Triangle class All points for the triangle
	 * will be set to null
	 */
	public Triangle() {
		this(null, null, null);
	}

	/**
	 * method stores the point in the appropriate cell (0 1, 2) given in index. If
	 * index is anything other than 0, 1, or 2, the method does not store the Point
	 * object.
	 * 
	 * @param index, an integer that indicates location in array of the desired
	 *               Point object
	 * @param point, an object of type point that will be inserted into the the
	 *               array.
	 */
	public void setPoint(int index, Point point) {
		if (index == 0 || index == 1 || index == 2) {
			array[index] = point;
		}
	}

	public int getID() {
		return this.id;
	}

	@Override
	public String toString() {
		return "--------------------------------\n" + "Triangle: " + id + "\n\n" + array[0].toString() + "\n"
				+ array[1].toString() + "\n" + array[2].toString() + "--------------------------------";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;
		Triangle other = (Triangle) object;
		if (!Arrays.equals(array, other.array))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + Arrays.hashCode(array);
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object object) {
//		if (object instanceof Triangle) {
//			return ((Triangle) object).id == this.id;
//		} else {
//			return false;
//		}
//	}

}
