package com.mauriciotogneri.designpatterns.creational.factorymethod;

public interface Shape
{
	public enum Type
	{
		CIRCLE, TRIANGLE, RECTANGLE
	};
	
	public void draw();
}