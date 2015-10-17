package com.mauriciotogneri.designpatterns.concurrency.doublecheckedlocking;

public class Main
{
	public static void main(String[] args)
	{
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
		connection1.execute("SELECT * FROM TABLE...");
		
		DatabaseConnection connection2 = DatabaseConnection.getInstance();
		connection2.execute("UPDATE TABLE SET...");
		
		DatabaseConnection connection3 = DatabaseConnection.getInstance();
		connection3.execute("TRUNCATE TABLE...");
	}
}