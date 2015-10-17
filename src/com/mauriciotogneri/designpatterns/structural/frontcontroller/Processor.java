package com.mauriciotogneri.designpatterns.structural.frontcontroller;

public interface Processor
{
	public enum Type
	{
		LOCAL, REMOTE
	}
	
	public void process(String request);
}