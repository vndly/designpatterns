package com.mauriciotogneri.designpatterns.concurrency.activeobject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ActiveObject
{
    private boolean isRunning = true;
    private int value = 0;
    private final BlockingQueue<Runnable> dispatchQueue = new LinkedBlockingQueue<>();

    public ActiveObject(int value)
    {
        this.value = value;
        start();
    }

    private void start()
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (isRunning() || (!ActiveObject.this.dispatchQueue.isEmpty()))
                {
                    try
                    {
                        ActiveObject.this.dispatchQueue.take().run();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
    }

    private boolean isRunning()
    {
        return this.isRunning;
    }

    public void stop()
    {
        this.isRunning = false;
    }

    public void multiplyBy(final int number) throws InterruptedException
    {
        this.dispatchQueue.put(new Runnable()
        {
            @Override
            public void run()
            {
                ActiveObject.this.value *= number;
                System.out.println("New value: " + ActiveObject.this.value);
            }

            ;
        });
    }

    public void add(final int number) throws InterruptedException
    {
        this.dispatchQueue.put(new Runnable()
        {
            @Override
            public void run()
            {
                ActiveObject.this.value += number;
                System.out.println("New value: " + ActiveObject.this.value);
            }

            ;
        });
    }
}