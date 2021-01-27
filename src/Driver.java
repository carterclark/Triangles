
public class Driver {

	public static void main(String[] args) {
		
		//making Point objects
		Point point1 = new Point(3, 8);
		Point point2 = new Point(10, 1);
		Point point3 = new Point(1, 9);
		
		Point point4 = new Point(4, 9);
		Point point5 = new Point(3, 7);
		Point point6 = new Point(1, 4);
		
		Point point7 = new Point(5, 2);
		Point point8 = new Point(8, 4);
		Point point9 = new Point(2, 3);
		
		Point point1Copy = point1;
		
		//testing Point methods
//		System.out.println(point1.toString());
		assert(point1.equals(point1Copy));
		assert(!point1.equals(point2));
		
		//making Triangle objects
		Triangle triangle1 = new Triangle(point1, point2, point3);
		Triangle triangle2 = new Triangle(point4, point5, point6);
		Triangle triangle3 = new Triangle(point7, point8, point9);
		
		Triangle triangle4 = new Triangle(point1);
		Triangle triangle5 = new Triangle();
		Triangle triangle1Copy = triangle1;
		
		//testing Triangle methods
//		System.out.println(triangle1.toString());
		triangle1.setPoint(2, point1);
//		System.out.println(triangle1.toString());
		
		assert(triangle1.equals(triangle1Copy));
		assert(!triangle1.equals(triangle2));
		
		//making Triangles object
		Triangles triangles = new Triangles();
		
		//testing Triangles methods
		triangles.addTriangle(triangle1);
		triangles.addTriangle(triangle2);
		triangles.addTriangle(triangle3);
		
		assert(triangles.getTriangle(1).equals(triangle1));
		assert(!triangles.getTriangle(1).equals(triangle2));
		
//		System.out.println(triangles.toString());
		triangles.deleteTriangle(triangle1);
		System.out.println(triangles.toString());
		
	}

}
