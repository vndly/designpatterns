package com.mauriciotogneri.designpatterns.creational.builder;

public class Person
{
    private final String name; // required
    private final String surname; // required
    private final int age; // optional
    private final float weight; // optional
    private final String phone; // optional
    private final String address; // optional

    private Person(String name, String surname, int age, float weight, String phone, String address)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.phone = phone;
        this.address = address;
    }

    public Person(PersonBuilder builder)
    {
        this(builder.name, builder.surname, builder.age, builder.weight, builder.phone, builder.address);
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Name:    ").append(this.name).append("\n");
        buffer.append("Surname: ").append(this.surname).append("\n");
        buffer.append("Age:     ").append(this.age).append("\n");
        buffer.append("Weight:  ").append(this.weight).append("\n");
        buffer.append("Phone:   ").append(this.phone).append("\n");
        buffer.append("Address: ").append(this.address).append("\n");

        return buffer.toString();
    }
}