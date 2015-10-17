package com.mauriciotogneri.designpatterns.structural.composite;

public class Triangle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing triangle...");
	}
}