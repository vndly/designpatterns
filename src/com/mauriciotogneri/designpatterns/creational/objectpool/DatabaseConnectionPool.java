package com.mauriciotogneri.designpatterns.creational.objectpool;

public class DatabaseConnectionPool extends Pool<DatabaseConnection>
{
	public DatabaseConnectionPool(ObjectPoolFactory<DatabaseConnection> factory, int maxSize)
	{
		super(factory, maxSize);
	}
}