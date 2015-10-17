package com.mauriciotogneri.designpatterns.behavioral.chainofresponsibility;

public abstract class Logger
{
    public static final int ERROR = 3;
    public static final int INFO = 5;
    public static final int DEBUG = 7;
    private final int mask;
    private Logger next;

    public Logger(int mask)
    {
        this.mask = mask;
    }

    public void setNext(Logger next)
    {
        this.next = next;
    }

    public void processMessage(String message, int priority)
    {
        if (priority <= this.mask)
        {
            writeMessage(message);
        }

        if (this.next != null)
        {
            this.next.processMessage(message, priority);
        }
    }

    abstract protected void writeMessage(String msg);
}