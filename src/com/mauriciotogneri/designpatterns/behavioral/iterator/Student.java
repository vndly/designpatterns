package com.mauriciotogneri.designpatterns.behavioral.iterator;

public class Student
{
    private final int id;
    private final String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Id:   ").append(this.id).append("\n");
        buffer.append("Name: ").append(this.name).append("\n");

        return buffer.toString();
    }
}