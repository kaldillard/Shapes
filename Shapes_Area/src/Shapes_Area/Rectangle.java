package Shapes_Area;

public class Rectangle extends Shape{
	public void set_l (int l_)
	{
		l = l_;
	}
	
	public int get_l ()
	{
		return l;
	}
	
	public void set_w (int w_)
	{
		w = w_;
	}
	
	public int get_w ()
	{
		return w;
	}
	
	public int Area()
	{
		return w*l;
	}
	
}