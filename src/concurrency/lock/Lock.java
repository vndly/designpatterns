package concurrency.lock;

public class Lock
{
	private boolean isLocked = false;
	
	public synchronized void lock()
	{
		while (this.isLocked)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		this.isLocked = true;
	}
	
	public synchronized void unlock()
	{
		this.isLocked = false;
		
		notify();
	}
}