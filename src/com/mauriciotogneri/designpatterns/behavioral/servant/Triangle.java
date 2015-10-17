package com.mauriciotogneri.designpatterns.behavioral.servant;

public class Triangle implements Movable
{
    private Position position;

    public Triangle(Position position)
    {
        this.position = position;
        System.out.println("Triangle initialized in (" + position.x + ", " + position.y + ")");
    }

    @Override
    public void setPosition(Position position)
    {
        this.position = position;
        System.out.println("Triangle moved to (" + position.x + ", " + position.y + ")");
    }

    @Override
    public Position getPosition()
    {
        return this.position;
    }
}