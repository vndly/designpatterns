package com.mauriciotogneri.designpatterns.creational.abstractfactory;

public class LinuxWindow implements Window
{
	@Override
	public void display()
	{
		System.out.println("Displaying Linux window...");
	}
}