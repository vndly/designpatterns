package com.mauriciotogneri.designpatterns.creational.objectpool;

public class DatabaseConnection
{
	public final String host;
	public final String user;
	public final String pass;
	
	public DatabaseConnection(String host, String user, String pass)
	{
		this.host = host;
		this.user = user;
		this.pass = pass;
	}
	
	public void executeQuery(String query)
	{
		System.out.println(query);
	}
}