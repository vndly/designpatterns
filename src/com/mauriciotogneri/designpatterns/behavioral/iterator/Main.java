package com.mauriciotogneri.designpatterns.behavioral.iterator;

public class Main
{
    public static void main(String[] args)
    {
        StudentList students = new StudentList();
        students.add(new Student(123, "Bob Williams"));
        students.add(new Student(456, "Peter Smith"));
        students.add(new Student(789, "Jeniffer Brown"));

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}