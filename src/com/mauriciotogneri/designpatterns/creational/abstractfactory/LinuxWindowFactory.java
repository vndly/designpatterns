package com.mauriciotogneri.designpatterns.creational.abstractfactory;

public class LinuxWindowFactory implements AbstractWindowFactory
{
	@Override
	public Window createWindow()
	{
		LinuxWindow window = new LinuxWindow();
		
		return window;
	}
}