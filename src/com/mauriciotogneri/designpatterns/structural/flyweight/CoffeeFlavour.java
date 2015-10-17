package com.mauriciotogneri.designpatterns.structural.flyweight;

public class CoffeeFlavour
{
	private final String name;
	
	public CoffeeFlavour(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
}