package com.mauriciotogneri.designpatterns.creational.objectpool;

public class DatabaseConnection
{
    private final String host;
    private final String user;
    private final String pass;

    public DatabaseConnection(String host, String user, String pass)
    {
        this.host = host;
        this.user = user;
        this.pass = pass;
    }

    public void connect()
    {
        System.out.println("Connecting to: " + host + " as: " + user + " with password: " + pass);
    }

    public void executeQuery(String query)
    {
        System.out.println(query);
    }
}