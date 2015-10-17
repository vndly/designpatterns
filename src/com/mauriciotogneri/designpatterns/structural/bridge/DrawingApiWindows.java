package com.mauriciotogneri.designpatterns.structural.bridge;

public class DrawingApiWindows implements DrawingApi
{
    @Override
    public void drawCircle(float x, float y, float radius)
    {
        System.out.println("Drawing circle in Windows in x: " + x + " y: " + y + " radius: " + radius);
    }

    @Override
    public void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3)
    {
        System.out.println("Drawing triangle in Windows in x1: " + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2 + " x3: " + x3 + " y3: " + y3);
    }

    @Override
    public void drawRectangle(float x, float y, float width, float height)
    {
        System.out.println("Drawing rectangle in Windows in x: " + x + " y: " + y + " width: " + width + " height: " + height);
    }
}