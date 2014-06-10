package concurrency.barrier;

import java.util.concurrent.CyclicBarrier;

public class Main
{
	public static void main(String[] args)
	{
		CyclicBarrier barrier = new CyclicBarrier(3, new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("All parties are arrived at barrier, opening the barrier...");
			}
		});
		
		Thread thread1 = new Thread(new Task(barrier), "Thread 1");
		Thread thread2 = new Thread(new Task(barrier), "Thread 2");
		Thread thread3 = new Thread(new Task(barrier), "Thread 3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}