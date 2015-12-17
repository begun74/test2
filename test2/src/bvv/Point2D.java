package bvv;

public class Point2D {
	private	int	x, y;
	
	private  int X=0;
	public	Point2D(int	x,	int	y) {
		X = this.x = x;
		this.y = y;
		System.out.println("Point2D");
	}
	
	public  int getX()
	{
		System.out.println("Point2D X = "+X);
		return X;
	}
}
