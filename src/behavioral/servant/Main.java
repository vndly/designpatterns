package behavioral.servant;

public class Main
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(new Position(0, 0));
		Triangle triangle = new Triangle(new Position(3, 3));
		Rectangle rectangle = new Rectangle(new Position(10, 10));
		
		MoveServant mover = new MoveServant();
		mover.moveBy(circle, 1, 2);
		mover.moveTo(triangle, new Position(3, 7));
		mover.moveBy(rectangle, -1, 8);
	}
}