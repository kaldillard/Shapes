package Shapes_Area;


public class Circle extends Shape{
	
	
	public void set_radius (int radius_)
	{
		radius = radius_;
	}
	
	public double get_radius ()
	{
		return radius;
	}
	
	public double Area()
	{
		return 3.14*radius*radius;
	}
	

}
