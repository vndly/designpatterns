package com.mauriciotogneri.designpatterns.concurrency.monitorobject;

public class Main
{
    public static void main(String[] args)
    {
        Producer producer = new Producer();
        producer.start();

        Consumer consumer1 = new Consumer(1, producer);
        consumer1.start();

        Consumer consumer2 = new Consumer(2, producer);
        consumer2.start();
    }
}