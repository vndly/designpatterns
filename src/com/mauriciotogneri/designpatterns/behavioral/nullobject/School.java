package com.mauriciotogneri.designpatterns.behavioral.nullobject;

import java.util.HashMap;
import java.util.Map;

public class School
{
    private final Map<Integer, Student> students = new HashMap<Integer, Student>();

    public School()
    {
        this.students.put(1, new Student(1, "Bob Williams"));
        this.students.put(2, new Student(2, "Peter Smith"));
        this.students.put(3, new Student(3, "Jeniffer Brown"));
    }

    public Student getStudent(int id)
    {
        Student result = null;

        if (this.students.containsKey(id))
        {
            result = this.students.get(id);
        }
        else
        {
            result = new NullStudent();
        }

        return result;
    }
}