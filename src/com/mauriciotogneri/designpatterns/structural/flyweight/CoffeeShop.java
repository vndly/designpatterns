package com.mauriciotogneri.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop
{
    private final List<Order> orders = new ArrayList<>();
    private final Menu menu = new Menu();

    public void takeOrder(String flavourName, int table)
    {
        CoffeeFlavour flavour = this.menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        this.orders.add(order);
    }

    public void service()
    {
        for (Order order : this.orders)
        {
            order.serve();
        }
    }

    public void report()
    {
        System.out.println("Total CoffeeFlavour objects made: " + this.menu.totalCoffeeFlavoursMade());
    }
}