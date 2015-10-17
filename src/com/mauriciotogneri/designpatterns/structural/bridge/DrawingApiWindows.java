package com.mauriciotogneri.designpatterns.structural.bridge;

public class DrawingApiWindows implements DrawingApi
{
	@Override
	public void drawCircle(float x, float y, float radius)
	{
		System.out.println("Drawing circle in Windows...");
	}
	
	@Override
	public void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3)
	{
		System.out.println("Drawing triangle in Windows...");
	}
	
	@Override
	public void drawRectangle(float x, float y, float width, float height)
	{
		System.out.println("Drawing rectangle in Windows...");
	}
}