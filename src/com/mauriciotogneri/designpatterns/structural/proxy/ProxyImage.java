package com.mauriciotogneri.designpatterns.structural.proxy;

public class ProxyImage implements Image
{
	private RealImage image = null;
	private final String fileName;
	
	public ProxyImage(String fileName)
	{
		this.fileName = fileName;
	}
	
	@Override
	public void display()
	{
		if (this.image == null)
		{
			this.image = new RealImage(this.fileName);
		}
		
		this.image.display();
	}
}