package Shapes_Area;

public class Main {

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.set_radius(15);
		System.out.println("The area of the circle is " + obj.Area());
		
		Cylinder obj2 = new Cylinder();
		obj2.set_radius(15);
		obj2.set_Height(12);
		System.out.println("The area of the cylinder is " + obj2.Area());
		
		Square obj3 = new Square();
		obj3.set_a(5);
		System.out.println("The area of the square is " + obj3.Area());
		
		Cube obj4 = new Cube();
		obj4.set_a(5);
		System.out.println("The area of the cube is " + obj4.Area());
		
		Rectangle obj5 = new Rectangle();
		obj5.set_l(10);
		obj5.set_w(15);
		System.out.println("The area of the rectangle is " + obj5.Area());
		
		RectangularPrism obj6 = new RectangularPrism();
		obj6.set_H(7);
		obj6.set_l(10);
		obj6.set_w(4);
		System.out.println("The area of the rectangular prism is " + obj6.Area());
		
		Triangle obj7 = new Triangle();
		obj7.set_b(9);
		obj7.set_h(13);
		System.out.println("The area of the triangle is " + obj7.Area());
		
		Pyramid obj8 = new Pyramid();
		obj8.set_h(4);
		obj8.set_l(6);
		obj8.set_w(8);
		System.out.println("The area of the triangle is " + obj8.Area());
		
	}

}
