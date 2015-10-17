package com.mauriciotogneri.designpatterns.concurrency.readwritelock;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Resource resource = new Resource();

        List<Thread> threads = new ArrayList<Thread>();

        threads.add(new Thread(new Reader(resource), "READER A"));
        threads.add(new Thread(new Reader(resource), "READER B"));
        threads.add(new Thread(new Reader(resource), "READER C"));

        threads.add(new Thread(new Writer(resource), "WRITER A"));
        threads.add(new Thread(new Writer(resource), "WRITER B"));
        threads.add(new Thread(new Writer(resource), "WRITER C"));

        for (Thread thread : threads)
        {
            thread.start();
        }

        for (Thread thread : threads)
        {
            try
            {
                thread.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}