package com.mauriciotogneri.designpatterns.structural.flyweight;

public class Main
{
	public static void main(String[] args)
	{
		CoffeeShop shop = new CoffeeShop();
		
		shop.takeOrder("Cappuccino", 2);
		shop.takeOrder("Frappe", 1);
		shop.takeOrder("Espresso", 1);
		shop.takeOrder("Frappe", 8);
		shop.takeOrder("Cappuccino", 9);
		shop.takeOrder("Frappe", 3);
		shop.takeOrder("Espresso", 3);
		shop.takeOrder("Cappuccino", 3);
		shop.takeOrder("Espresso", 6);
		shop.takeOrder("Frappe", 5);
		shop.takeOrder("Cappuccino", 2);
		shop.takeOrder("Espresso", 4);
		
		shop.service();
		shop.report();
	}
}