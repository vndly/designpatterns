package com.mauriciotogneri.designpatterns.concurrency.readwritelock;

public class Writer implements Runnable
{
	private final Resource resource;
	
	public Writer(Resource resource)
	{
		this.resource = resource;
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			this.resource.write(Thread.currentThread().getName() + " -> " + i);
		}
	}
}