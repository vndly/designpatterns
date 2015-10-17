package com.mauriciotogneri.designpatterns.creational.objectpool;

public interface ObjectPoolFactory<Type>
{
    Type createObject();
}