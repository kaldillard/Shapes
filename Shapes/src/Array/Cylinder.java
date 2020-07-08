package Array;

public class Cylinder extends Shape{
	
	protected double height;
	
	public void set_Height (double height_)
	{
		height = height_;
	}
	
	public double get_Height ()
	{
		return height ;
	}
	
	public double Area()
	{
		return (2*3.14*radius*height) + (2*3.14*radius*radius);
	}


}
