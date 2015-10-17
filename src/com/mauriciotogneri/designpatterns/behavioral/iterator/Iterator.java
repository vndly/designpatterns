package com.mauriciotogneri.designpatterns.behavioral.iterator;

public interface Iterator<Type>
{
	public boolean hasNext();
	
	public Type next();
}