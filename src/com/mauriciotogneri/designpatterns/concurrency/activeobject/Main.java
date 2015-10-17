package com.mauriciotogneri.designpatterns.concurrency.activeobject;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			ActiveObject activeObject = new ActiveObject(10);
			activeObject.multiplyBy(3);
			activeObject.add(7);
			activeObject.multiplyBy(2);
			activeObject.stop();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}