package com.mauriciotogneri.designpatterns.structural.frontcontroller;

import com.mauriciotogneri.designpatterns.structural.frontcontroller.Processor.Type;

public class Dispatcher
{
	private final Processor local;
	private final Processor remote;
	
	public Dispatcher()
	{
		this.local = new LocalProcessor();
		this.remote = new RemoteProcessor();
	}
	
	public void dispatch(Type type, String request)
	{
		if (type == Type.LOCAL)
		{
			this.local.process(request);
		}
		else if (type == Type.REMOTE)
		{
			this.remote.process(request);
		}
	}
}