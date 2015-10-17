package com.mauriciotogneri.designpatterns.concurrency.threadpool;

public class Main
{
	public static void main(String[] args)
	{
		ThreadPool threadPool = new ThreadPool(3);
		
		for (int i = 0; i < 10; i++)
		{
			final int taskId = i + 1;

			threadPool.addTask(new Runnable()
			{
				@Override
				public void run()
				{
					System.out.println("This is the task #" + taskId);
				}
			});
		}
		
		threadPool.shutdown();
	}
}