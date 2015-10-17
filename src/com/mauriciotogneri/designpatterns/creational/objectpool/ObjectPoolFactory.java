package com.mauriciotogneri.designpatterns.creational.objectpool;

public interface ObjectPoolFactory<Type>
{
    public Type createObject();
}