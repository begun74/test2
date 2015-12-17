package bvv.gof.bridge;

public abstract class Shape {
	protected Color color ;

	public Shape() 
	{
		color = null;
	}
	public abstract void performWithColor();
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	

}
