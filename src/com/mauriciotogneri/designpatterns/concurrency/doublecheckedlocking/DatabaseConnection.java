package com.mauriciotogneri.designpatterns.concurrency.doublecheckedlocking;

public class DatabaseConnection
{
	private static volatile DatabaseConnection helper;
	
	private DatabaseConnection()
	{
		System.out.println("Initializing database...");
	}
	
	public static DatabaseConnection getInstance()
	{
		DatabaseConnection result = DatabaseConnection.helper;
		
		if (result == null)
		{
			synchronized (DatabaseConnection.class)
			{
				result = DatabaseConnection.helper;
				
				if (result == null)
				{
					DatabaseConnection.helper = result = new DatabaseConnection();
				}
			}
		}
		
		return result;
	}
	
	public void execute(String query)
	{
		System.out.println("Executing query: " + query);
	}
}