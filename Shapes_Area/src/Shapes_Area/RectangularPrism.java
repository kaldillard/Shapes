package Shapes_Area;

public class RectangularPrism extends Rectangle{
	protected int H;
	
	public void set_H (int H_)
	{
		H=H_;
	}

	public int get_H ()
	{
		return H;
	}
	
	public int Area ()
	{
		return 2*(w*l+H*l+H*w);
	}
}
