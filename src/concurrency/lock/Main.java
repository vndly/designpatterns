package concurrency.lock;

public class Main
{
	private static final int MAX_ITERATIONS = 10000;
	
	public static void main(String[] args)
	{
		final Counter counter = new Counter();
		
		Thread threadIncrement = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for (int i = 0; i < Main.MAX_ITERATIONS; i++)
				{
					counter.increment();
					System.out.println("Count: " + counter.getCount());
				}
			}
		});
		
		Thread threadDecrement = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for (int i = 0; i < Main.MAX_ITERATIONS; i++)
				{
					counter.decrement();
					System.out.println("Count: " + counter.getCount());
				}
			}
		});
		
		threadIncrement.start();
		threadDecrement.start();
	}
}