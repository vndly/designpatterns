package com.mauriciotogneri.designpatterns.behavioral.iterator;

public class Student
{
	public final int id;
	public final String name;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Id:   " + this.id + "\n");
		buffer.append("Name: " + this.name + "\n");
		
		return buffer.toString();
	}
}