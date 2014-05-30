package creational.prototype;

import creational.prototype.Shape.Type;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Shape shape1 = ShapeFactory.getInstance(Type.CIRCLE);
			shape1.draw();
			
			Shape shape2 = ShapeFactory.getInstance(Type.TRIANGLE);
			shape2.draw();
			
			Shape shape3 = ShapeFactory.getInstance(Type.RECTANGLE);
			shape3.draw();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}