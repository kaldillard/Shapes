package Shapes_Area;

public class Triangle extends Shape {
	public void set_b (int b_)
	{
		b = b_;
	}
	
	public double get_b ()
	{
		return b;
	}
	
	public void set_h (int h_)
	{
		h = h_;
	}
	
	public double get_h ()
	{
		return h;
	}
	
	public double Area ()
	{
		return (b*h)/2; 
	}
}