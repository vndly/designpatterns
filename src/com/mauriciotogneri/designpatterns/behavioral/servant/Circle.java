package com.mauriciotogneri.designpatterns.behavioral.servant;

public class Circle implements Movable
{
	private Position position;
	
	public Circle(Position position)
	{
		this.position = position;
		System.out.println("Circle initialized in (" + position.x + ", " + position.y + ")");
	}
	
	@Override
	public void setPosition(Position position)
	{
		this.position = position;
		System.out.println("Circle moved to (" + position.x + ", " + position.y + ")");
	}
	
	@Override
	public Position getPosition()
	{
		return this.position;
	}
}