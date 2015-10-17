package com.mauriciotogneri.designpatterns.behavioral.iterator;

public interface Iterator<Type>
{
    boolean hasNext();

    Type next();
}