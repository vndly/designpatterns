package com.mauriciotogneri.designpatterns.behavioral.servant;

public class MoveServant
{
	public void moveTo(Movable serviced, Position position)
	{
		serviced.setPosition(position);
	}
	
	public void moveBy(Movable serviced, int x, int y)
	{
		int targetX = x + serviced.getPosition().x;
		int targetY = y + serviced.getPosition().y;
		
		serviced.setPosition(new Position(targetX, targetY));
	}
}