package structural.adapter;

public class LegacyRectangle
{
	public void draw(int x, int y, int w, int h)
	{
		System.out.println("Drawing rectangle (" + x + ", " + y + ") with width: " + w + " and height: " + h);
	}
}