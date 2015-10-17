package com.mauriciotogneri.designpatterns.concurrency.readwritelock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Resource
{
    private final List<String> content;
    private final ReentrantReadWriteLock lock;

    public Resource()
    {
        this.content = new ArrayList<>();
        this.lock = new ReentrantReadWriteLock();
    }

    public void write(String value)
    {
        this.lock.writeLock().lock();

        try
        {
            System.out.println("Writer => Number of threads waiting: " + this.lock.getQueueLength());
            System.out.println("Writer => Number of write locks waiting: " + this.lock.getWriteHoldCount());

            this.content.add(value);
            System.out.println("Writer => Writing: " + value + "\n");

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        finally
        {
            this.lock.writeLock().unlock();
        }
    }

    public void read()
    {
        this.lock.readLock().lock();

        try
        {
            System.out.println("Reader => Number of threads waiting: " + this.lock.getQueueLength());
            System.out.println("Reader => Number of read locks: " + this.lock.getReadLockCount());

            if (this.content.size() > 0)
            {
                System.out.println("Reader => Reading: " + this.content.remove(0) + "\n");
            }
            else
            {
                System.out.println("Reader => Nothing to read\n");
            }

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        finally
        {
            this.lock.readLock().unlock();
        }
    }
}