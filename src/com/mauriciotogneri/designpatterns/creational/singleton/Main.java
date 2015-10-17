package com.mauriciotogneri.designpatterns.creational.singleton;

public class Main
{
    public static void main(String[] args)
    {
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        databaseConnection1.executeQuery("SELECT * FROM TABLE_A...");

        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        databaseConnection2.executeQuery("UPDATE TABLE_B...");

        DatabaseConnection databaseConnection3 = DatabaseConnection.getInstance();
        databaseConnection3.executeQuery("DELETE FROM TABLE_C...");
    }
}