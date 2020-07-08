package Shapes_Area;


public class Square extends Shape {
	public void set_a (int a_)
	{
		a = a_;
	}
	
	public int get_a ()
	{
		return a;
	}
	
	public int Area()
	{
		return a*a;
	}

}