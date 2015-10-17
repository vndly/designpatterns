package com.mauriciotogneri.designpatterns.creational.singleton;

public class DatabaseConnection
{
    private static DatabaseConnection instance = null;

    private DatabaseConnection()
    {
        System.out.println("Initializing database connection...");
    }

    public static synchronized DatabaseConnection getInstance()
    {
        if (DatabaseConnection.instance == null)
        {
            synchronized (DatabaseConnection.class)
            {
                if (DatabaseConnection.instance == null)
                {
                    DatabaseConnection.instance = new DatabaseConnection();
                }
            }
        }

        return DatabaseConnection.instance;
    }

    public void executeQuery(String query)
    {
        System.out.println(query);
    }
}