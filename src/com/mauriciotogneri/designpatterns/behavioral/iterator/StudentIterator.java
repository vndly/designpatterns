package com.mauriciotogneri.designpatterns.behavioral.iterator;

import java.util.List;

public class StudentIterator implements Iterator<Student>
{
	private final List<Student> list;
	private int position = 0;
	
	public StudentIterator(List<Student> list)
	{
		this.list = list;
	}
	
	@Override
	public boolean hasNext()
	{
		return (this.position < this.list.size());
	}
	
	@Override
	public Student next()
	{
		return this.list.get(this.position++);
	}
}