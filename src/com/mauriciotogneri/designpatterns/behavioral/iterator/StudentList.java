package com.mauriciotogneri.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentList implements Collection<Student>
{
	private final List<Student> list = new ArrayList<Student>();
	
	@Override
	public void add(Student student)
	{
		this.list.add(student);
	}
	
	@Override
	public void remove(Student student)
	{
		this.list.remove(student);
	}
	
	@Override
	public Iterator<Student> iterator()
	{
		return new StudentIterator(this.list);
	}
}