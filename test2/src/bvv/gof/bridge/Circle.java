package bvv.gof.bridge;

public class Circle extends Shape {

	public Circle(Color color)
	{
		setColor(color);
	}

	@Override
	public void performWithColor() {
		System.out.println("Performing in Circle class");
		color.useBrush();
	}

}
