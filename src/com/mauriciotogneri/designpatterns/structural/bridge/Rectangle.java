package com.mauriciotogneri.designpatterns.structural.bridge;

public class Rectangle extends Shape
{
    private final float x;
    private final float y;
    private final float width;
    private final float height;

    public Rectangle(float x, float y, float width, float height, DrawingApi drawingApi)
    {
        super(drawingApi);

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw()
    {
        this.drawingAPI.drawRectangle(this.x, this.y, this.width, this.height);
    }
}