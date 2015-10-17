package com.mauriciotogneri.designpatterns.structural.decorator;

public class SimpleWindow implements Window
{
	@Override
	public void draw()
	{
		System.out.println("Drawing simple window...");
	}
	
	@Override
	public String getDescription()
	{
		return "Simple Window";
	}
}