package com.mauriciotogneri.designpatterns.structural.bridge;

public abstract class Shape
{
    protected final DrawingApi drawingAPI;

    protected Shape(DrawingApi drawingAPI)
    {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}