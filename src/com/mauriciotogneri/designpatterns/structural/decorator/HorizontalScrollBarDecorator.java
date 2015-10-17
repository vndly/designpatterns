package com.mauriciotogneri.designpatterns.structural.decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator
{
	public HorizontalScrollBarDecorator(Window windowToBeDecorated)
	{
		super(windowToBeDecorated);
	}
	
	@Override
	public void draw()
	{
		super.draw();
		drawHorizontalScrollBar();
	}
	
	private void drawHorizontalScrollBar()
	{
		System.out.println("Drawing horizontal scroll bars...");
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + ", including horizontal scrollbars";
	}
}