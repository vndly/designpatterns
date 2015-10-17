package com.mauriciotogneri.designpatterns.concurrency.barrier;

import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable
{
	private final CyclicBarrier barrier;
	
	public Task(CyclicBarrier barrier)
	{
		this.barrier = barrier;
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + " is waiting on barrier...");
			
			this.barrier.await();
			
			System.out.println(Thread.currentThread().getName() + " has crossed the barrier...");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}