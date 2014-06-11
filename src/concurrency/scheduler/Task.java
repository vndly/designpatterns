package concurrency.scheduler;

public class Task implements Runnable
{
	private int counter = 0;
	
	@Override
	public void run()
	{
		System.out.println("Executed: " + this.counter++);
	}
}