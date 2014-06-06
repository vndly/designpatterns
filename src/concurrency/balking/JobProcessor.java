package concurrency.balking;

public class JobProcessor
{
	private boolean jobInProgress = false;
	
	public void process(int value)
	{
		synchronized (this)
		{
			if (this.jobInProgress)
			{
				System.out.println("Job balked for: " + value);
				return;
			}
			this.jobInProgress = true;
		}
		
		try
		{
			System.out.println("Starting job for: " + value);
			Thread.sleep(value);
			System.out.println("Job done");
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		jobCompleted();
	}
	
	private void jobCompleted()
	{
		synchronized (this)
		{
			this.jobInProgress = false;
		}
	}
}