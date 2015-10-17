package com.mauriciotogneri.designpatterns.structural.bridge;

public class Circle extends Shape
{
    private final float x;
    private final float y;
    private final float radius;

    public Circle(float x, float y, float radius, DrawingApi drawingApi)
    {
        super(drawingApi);

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        this.drawingAPI.drawCircle(this.x, this.y, this.radius);
    }
}