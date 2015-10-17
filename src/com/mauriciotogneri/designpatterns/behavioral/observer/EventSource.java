package com.mauriciotogneri.designpatterns.behavioral.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			InputStreamReader inputStream = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			
			while (true)
			{
				System.out.print("Input: ");
				String response = bufferedReader.readLine();
				setChanged();
				notifyObservers(response);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}