package com.mauriciotogneri.designpatterns.creational.abstractfactory;

public class MacWindow implements Window
{
	@Override
	public void display()
	{
		System.out.println("Displaying Mac window...");
	}
}