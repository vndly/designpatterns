package com.mauriciotogneri.designpatterns.concurrency.monitorobject;

import java.util.Random;

public class Consumer extends Thread
{
	private final int id;
	private final Producer producer;
	
	public Consumer(int id, Producer producer)
	{
		this.id = id;
		this.producer = producer;
	}
	
	@Override
	public void run()
	{
		try
		{
			while (true)
			{
				String message = this.producer.getMessage();
				
				System.out.println("Consumer " + this.id + " got message: " + message);
				
				Thread.sleep(new Random().nextInt(2000));
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}