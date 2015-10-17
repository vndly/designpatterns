package com.mauriciotogneri.designpatterns.structural.frontcontroller;

public class RemoteProcessor implements Processor
{
	@Override
	public void process(String request)
	{
		System.out.println("Using remote processor: " + request);
	}
}