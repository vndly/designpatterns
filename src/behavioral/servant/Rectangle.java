package behavioral.servant;

public class Rectangle implements Movable
{
	private Position position;
	
	public Rectangle(Position position)
	{
		this.position = position;
		System.out.println("Rectangle initialized in (" + position.x + ", " + position.y + ")");
	}
	
	@Override
	public void setPosition(Position position)
	{
		this.position = position;
		System.out.println("Rectangle moved to (" + position.x + ", " + position.y + ")");
	}
	
	@Override
	public Position getPosition()
	{
		return this.position;
	}
}