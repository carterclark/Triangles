
/**
 * This is a collection class that uses java.util.LinkedListto store Triangleobjects
 * @author Carter Clark
 */

import java.util.LinkedList;

public class Triangles {

	/**
	 * Instance Variable: triangles, a linked list array that contains objects of
	 * type Triangle
	 */
	private LinkedList<Triangle> triangles = new LinkedList<Triangle>();

	/**
	 * This method adds a Triangle object to the triangles list
	 * 
	 * @param triangle, an object of type Triangle
	 */
	public void addTriangle(Triangle triangle) {
		triangles.add(triangle);
	}

	/**
	 * method deletes the Triangle object from the triangleslist and returns the
	 * deleted Triangle. If the Triangle object is not in the list of Triangle
	 * objects, the method returns null.
	 * 
	 * @param triangle, an object of type Triangle
	 * @return the Triangle object that was deleted or null if it was not found
	 */
	public Triangle deleteTriangle(Triangle triangle) {
		if (triangles.contains(triangle)) {
			triangles.remove(triangle);
			return triangle;
		}
		return null;
	}

	/**
	 * This method returns the Triangle object with an id equal to the one given in
	 * the parameter. If such a Triangle object is not in the list of Triangle
	 * objects, the method returns null
	 * 
	 * @param id, an integer that identifies the triangle
	 * @return the triangle from the list or null if the triangle is not present
	 */
	public Triangle getTriangle(int id) {

		for (int i = 0; i < triangles.size(); i++) {
			if (triangles.get(i).getID() == id) {
				return triangles.get(i);
			}
		}

		return null;
	}

	@Override
	public String toString() {
		int len = triangles.size();

		String str = "\nTriangles List:";
		for (int i = 0; i < len; i++) {
			str += "\n" + triangles.get(i).toString();
		}

		str += "\n";

		return str;
	}
}
