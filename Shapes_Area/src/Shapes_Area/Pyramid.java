package Shapes_Area;

public class Pyramid extends Triangle {
	protected int w;
	protected int l;
	
	public void set_w (int w_)
	{
		w = w_;
	}
	
	public double get_w ()
	{
		return w;
	}
	
	public void set_l (int l_)
	{
		l = l_;
	}
	
	public double get_l ()
	{
		return l;
	}

	public double Area ()
	{
		return (l*w+l) * Math.sqrt((w/2)*(w/2)+h*h+w) * Math.sqrt((l/2)*(l/2)+h*h);
	}

}
