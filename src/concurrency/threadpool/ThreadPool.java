package concurrency.threadpool;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool
{
	private final Object threadPoolLock = new Object();
	private final List<Runnable> taskQueue = new ArrayList<Runnable>();
	private final List<WorkerThread> workerThreadsList = new ArrayList<WorkerThread>();
	
	public ThreadPool(int poolSize)
	{
		for (int i = 0; i < poolSize; i++)
		{
			WorkerThread thread = new WorkerThread(i, this);
			this.workerThreadsList.add(thread);
			thread.start();
		}
	}
	
	public void addTask(Runnable task)
	{
		synchronized (this.taskQueue)
		{
			this.taskQueue.add(task);
			
			synchronized (this.threadPoolLock)
			{
				this.threadPoolLock.notifyAll();
			}
		}
	}
	
	public boolean hasMoreTasks()
	{
		boolean result = false;

		synchronized (this.taskQueue)
		{
			result = (!this.taskQueue.isEmpty());
		}

		return result;
	}

	public synchronized Runnable getNextTask()
	{
		Runnable result = null;

		synchronized (this.taskQueue)
		{
			if (hasMoreTasks())
			{
				result = this.taskQueue.get(0);
				this.taskQueue.remove(0);
			}
		}

		return result;
	}
	
	public Object getLock()
	{
		return this.threadPoolLock;
	}
	
	public void shutdown()
	{
		for (WorkerThread thread : this.workerThreadsList)
		{
			thread.shutdown();
		}
		
		synchronized (this.threadPoolLock)
		{
			this.threadPoolLock.notifyAll();
		}
	}
}