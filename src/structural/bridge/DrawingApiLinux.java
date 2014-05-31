package structural.bridge;

public class DrawingApiLinux implements DrawingApi
{
	@Override
	public void drawCircle(float x, float y, float radius)
	{
		System.out.println("Drawing circle in Linux...");
	}
	
	@Override
	public void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3)
	{
		System.out.println("Drawing triangle in Linux...");
	}
	
	@Override
	public void drawRectangle(float x, float y, float width, float height)
	{
		System.out.println("Drawing rectangle in Linux...");
	}
}