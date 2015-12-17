package bvv.gof.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color)
	{
		setColor(color);
	}
	
	@Override
	public void performWithColor() {
		System.out.println("Performing in Rectangle class");
		color.useBrush();
	}

}
