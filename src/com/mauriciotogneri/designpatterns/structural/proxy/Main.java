package com.mauriciotogneri.designpatterns.structural.proxy;

public class Main
{
    public static void main(String[] args)
    {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.png");

        image1.display(); // loading necessary
        image1.display(); // loading unnecessary
        image2.display(); // loading necessary
        image2.display(); // loading unnecessary
        image1.display(); // loading unnecessary
    }
}