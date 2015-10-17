package com.mauriciotogneri.designpatterns.concurrency.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main
{
	public static void main(String[] args)
	{
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(new Task(), 3, 1, TimeUnit.SECONDS);
		scheduler.schedule(new Runnable()
		{
			@Override
			public void run()
			{
				scheduler.shutdown();
			}
		}, 10, TimeUnit.SECONDS);
	}
}