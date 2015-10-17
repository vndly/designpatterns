package com.mauriciotogneri.designpatterns.structural.bridge;

public class Triangle extends Shape
{
	private final float x1;
	private final float y1;
	private final float x2;
	private final float y2;
	private final float x3;
	private final float y3;
	
	public Triangle(float x1, float y1, float x2, float y2, float x3, float y3, DrawingApi drawingApi)
	{
		super(drawingApi);
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	@Override
	public void draw()
	{
		this.drawingAPI.drawTriangle(this.x1, this.y1, this.x2, this.y2, this.x3, this.y3);
	}
}