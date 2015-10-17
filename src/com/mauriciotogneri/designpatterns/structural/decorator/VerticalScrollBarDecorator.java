package com.mauriciotogneri.designpatterns.structural.decorator;

public class VerticalScrollBarDecorator extends WindowDecorator
{
	public VerticalScrollBarDecorator(Window windowToBeDecorated)
	{
		super(windowToBeDecorated);
	}
	
	@Override
	public void draw()
	{
		super.draw();
		drawVerticalScrollBar();
	}
	
	private void drawVerticalScrollBar()
	{
		System.out.println("Drawing vertical scroll bars...");
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + ", including vertical scrollbars";
	}
}