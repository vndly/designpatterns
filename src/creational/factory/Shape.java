package creational.factory;

public interface Shape
{
	public enum Type
	{
		CIRCLE, TRIANGLE, RECTANGLE
	};
	
	public void draw();
}