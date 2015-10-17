package com.mauriciotogneri.designpatterns.structural.decorator;

public class Main
{
	public static void main(String[] args)
	{
		SimpleWindow simpleWindow = new SimpleWindow();
		VerticalScrollBarDecorator verticalScrollBarWindow = new VerticalScrollBarDecorator(simpleWindow);
		HorizontalScrollBarDecorator horizontalScrollBarWindow = new HorizontalScrollBarDecorator(verticalScrollBarWindow);
		
		horizontalScrollBarWindow.draw();
		System.out.println(horizontalScrollBarWindow.getDescription());
	}
}