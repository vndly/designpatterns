package com.mauriciotogneri.designpatterns.creational.objectpool;

public class Main
{
	public static void main(String[] args)
	{
		ObjectPoolFactory<DatabaseConnection> factory = new ObjectPoolFactory<DatabaseConnection>()
		{
			@Override
			public DatabaseConnection createObject()
			{
				return new DatabaseConnection("localhost", "uer", "1234");
			}
		};
		
		DatabaseConnectionPool connectionPool = new DatabaseConnectionPool(factory, 100);
		
		DatabaseConnection databaseConnection1 = connectionPool.newObject();
		databaseConnection1.executeQuery("SELECT * FROM TABLE_A...");
		databaseConnection1.executeQuery("SELECT * FROM TABLE_B...");
		
		DatabaseConnection databaseConnection2 = connectionPool.newObject();
		databaseConnection2.executeQuery("UPDATE TABLE_C...");
		databaseConnection2.executeQuery("UPDATE TABLE_D...");
		
		connectionPool.free(databaseConnection1);
		connectionPool.free(databaseConnection2);
		
		DatabaseConnection databaseConnection3 = connectionPool.newObject();
		databaseConnection3.executeQuery("DELETE FROM TABLE_E...");
		databaseConnection3.executeQuery("DELETE FROM TABLE_F...");
	}
}