package com.mauriciotogneri.designpatterns.creational.prototype;

public class Triangle implements Shape
{
	@Override
	public Triangle clone() throws CloneNotSupportedException
	{
		return (Triangle)super.clone();
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing triangle...");
	}
}