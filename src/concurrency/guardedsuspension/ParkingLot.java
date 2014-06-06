package concurrency.guardedsuspension;

import java.util.Random;

public class ParkingLot
{
	private static final int MAX_CAPACITY = 3;
	private int parkedCars = 0;
	
	public synchronized void park(final int carId)
	{
		while (this.parkedCars >= ParkingLot.MAX_CAPACITY)
		{
			try
			{
				System.out.println("Car " + carId + " waiting...");
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Car " + carId + " parked...");
		
		this.parkedCars++;
		
		Thread thread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				sleep(new Random().nextInt(1000));
				leave(carId);
			}
		});
		
		thread.start();
	}
	
	private void sleep(int time)
	{
		try
		{
			Thread.sleep(time);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	private synchronized void leave(int carId)
	{
		this.parkedCars--;
		
		System.out.println("Car: " + carId + " leaving...");
		
		notify();
	}
}