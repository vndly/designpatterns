package creational.lazyinitialization;

import java.util.HashMap;
import java.util.Map;

public class Shape
{
	private final Type type;
	private static Map<Type, Shape> types = new HashMap<Type, Shape>();
	
	public enum Type
	{
		CIRCLE, TRIANGLE, RECTANGLE
	};
	
	private Shape(Type type)
	{
		this.type = type;
	}
	
	public void draw()
	{
		// Draws the shape
		System.out.println(this.type);
	}
	
	public static Shape getShape(Type type)
	{
		Shape shape = null;
		
		if (Shape.types.containsKey(type))
		{
			shape = Shape.types.get(type);
		}
		else
		{
			shape = new Shape(type);
			Shape.types.put(type, shape);
		}
		
		return shape;
	}
}