package com.mauriciotogneri.designpatterns.concurrency.balking;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        JobProcessor jobProcessor = new JobProcessor();

        List<Integer> values = new ArrayList<Integer>();
        values.add(500);
        values.add(3500);
        values.add(300);
        values.add(200);
        values.add(500);
        values.add(600);

        for (Integer value : values)
        {
            Main.processJob(jobProcessor, value);
            Thread.sleep(1000);
        }
    }

    private static void processJob(final JobProcessor jobProcessor, final int value)
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                jobProcessor.process(value);
            }
        });

        thread.start();
    }
}