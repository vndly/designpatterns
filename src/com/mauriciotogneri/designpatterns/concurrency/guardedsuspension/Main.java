package com.mauriciotogneri.designpatterns.concurrency.guardedsuspension;

public class Main
{
	public static void main(String[] args)
	{
		ParkingLot parkingLot = new ParkingLot();
		Main.parkCar(parkingLot, 1);
		Main.parkCar(parkingLot, 2);
		Main.parkCar(parkingLot, 3);
		Main.parkCar(parkingLot, 4);
		Main.parkCar(parkingLot, 5);
		Main.parkCar(parkingLot, 6);
	}
	
	private static void parkCar(final ParkingLot parkingLot, final int carId)
	{
		Thread thread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				parkingLot.park(carId);
			}
		});
		
		thread.start();
	}
}