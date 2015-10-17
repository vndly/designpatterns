package com.mauriciotogneri.designpatterns.concurrency.threadpool;

public class WorkerThread extends Thread
{
	private final int id;
	private final ThreadPool threadPool;
	private final Object threadPoolLock;
	private volatile boolean shutdown = false;
	
	public WorkerThread(int id, ThreadPool threadPool)
	{
		this.id = id;
		this.threadPool = threadPool;
		this.threadPoolLock = threadPool.getLock();
	}
	
	@Override
	public void run()
	{
		while (stillRunning() || this.threadPool.hasMoreTasks())
		{
			
			Runnable task = this.threadPool.getNextTask();
			
			if (task != null)
			{
				System.out.println("Worker " + this.id + " executing...");
				task.run();
				System.out.println();
			}
			else
			{
				if (stillRunning() || this.threadPool.hasMoreTasks())
				{
					synchronized (this.threadPoolLock)
					{
						try
						{
							this.threadPoolLock.wait();
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
			
			Thread.yield();
		}
	}
	
	private boolean stillRunning()
	{
		return (!this.shutdown);
	}
	
	public void shutdown()
	{
		this.shutdown = true;
	}
}