package Array;

public class Main {

	public static void main(String[] args) {
		
		Circle obj = new Circle();
		obj.set_radius(15);
		System.out.println("The area of the cirlce is " + obj.Area());
		
		Cylinder obj2 = new Cylinder();
		obj2.set_radius(15);
		obj2.set_Height(12);
		System.out.println("The area of the cylinder is " + obj2.Area());

	}

}
