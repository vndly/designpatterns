package com.mauriciotogneri.designpatterns.creational.prototype;

public interface Shape extends Cloneable
{
	public enum Type
	{
		CIRCLE, TRIANGLE, RECTANGLE
	};
	
	public Shape clone() throws CloneNotSupportedException;
	
	public void draw();
}