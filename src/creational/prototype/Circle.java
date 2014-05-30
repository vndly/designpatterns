package creational.prototype;

public class Circle implements Shape
{
	@Override
	public Circle clone() throws CloneNotSupportedException
	{
		return (Circle)super.clone();
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing cicle...");
	}
}