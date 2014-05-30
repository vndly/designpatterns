package creational.builder.good;

public class Person
{
	public final String name; // required
	public final String surname; // required
	public final int age; // optional
	public final float weight; // optional
	public final String phone; // optional
	public final String address; // optional
	
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
		
		buffer.append("Name:    " + this.name + "\n");
		buffer.append("Surname: " + this.surname + "\n");
		buffer.append("Age:     " + this.age + "\n");
		buffer.append("Weight:  " + this.weight + "\n");
		buffer.append("Phone:   " + this.phone + "\n");
		buffer.append("Address: " + this.address + "\n");
		
		return buffer.toString();
	}
}