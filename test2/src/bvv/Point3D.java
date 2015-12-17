package bvv;

public class Point3D extends Point2D {
	private int z;
	private  int X=0;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D");
	}
	
	public Point3D() {
		this(-1,-1,-1);
	}
	
	public int getX()
	{
		//System.out.println("Point3D X = "+X);
		return super.getX();
	}
	

}
