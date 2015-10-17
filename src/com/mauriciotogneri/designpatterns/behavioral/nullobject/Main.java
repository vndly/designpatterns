package com.mauriciotogneri.designpatterns.behavioral.nullobject;

public class Main
{
    public static void main(String[] args)
    {
        School school = new School();

        Student student1 = school.getStudent(1);
        System.out.println("Student with id: " + student1.id + " name: " + student1.name);

        Student student2 = school.getStudent(2);
        System.out.println("Student with id: " + student2.id + " name: " + student2.name);

        Student student3 = school.getStudent(3);
        System.out.println("Student with id: " + student3.id + " name: " + student3.name);

        Student student4 = school.getStudent(4);
        System.out.println("Student with id: " + student4.id + " name: " + student4.name);
    }
}