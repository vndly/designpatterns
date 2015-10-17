package com.mauriciotogneri.designpatterns.concurrency.readwritelock;

public class Reader implements Runnable
{
    private final Resource resource;

    public Reader(Resource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            this.resource.read();
        }
    }
}