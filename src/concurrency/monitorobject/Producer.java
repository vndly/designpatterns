package concurrency.monitorobject;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread
{
	private int index = 1000;
	private static final int MAX_CAPACITY = 5;
	private final Queue<String> messages = new ArrayBlockingQueue<String>(Producer.MAX_CAPACITY);
	
	@Override
	public void run()
	{
		try
		{
			while (true)
			{
				putMessage();
				Thread.sleep(new Random().nextInt(1000));
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	private synchronized void putMessage() throws InterruptedException
	{
		String message = String.valueOf(this.index++);
		
		while (this.messages.size() == Producer.MAX_CAPACITY)
		{
			wait();
		}
		
		this.messages.add(message);
		
		System.out.println("Produced message: " + message);
		
		notify();
	}
	
	public synchronized String getMessage() throws InterruptedException
	{
		notify();
		
		while (this.messages.size() == 0)
		{
			wait();
		}
		
		String message = this.messages.poll();
		
		return message;
	}
}