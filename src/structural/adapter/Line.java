package structural.adapter;

public class Line implements Shape
{
	private final LegacyLine adaptee = new LegacyLine();
	
	@Override
	public void draw(int x1, int y1, int x2, int y2)
	{
		this.adaptee.draw(x1, y1, x2, y2);
	}
}