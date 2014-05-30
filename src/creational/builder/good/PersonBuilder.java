package creational.builder.good;

public class PersonBuilder
{
	public final String name; // required
	public final String surname; // required
	public int age = 0; // optional
	public float weight = 0; // optional
	public String phone = ""; // optional
	public String address = ""; // optional
	
	public PersonBuilder(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	
	public PersonBuilder age(int age)
	{
		this.age = age;
		
		return this;
	}
	
	public PersonBuilder weight(float weight)
	{
		this.weight = weight;
		
		return this;
	}
	
	public PersonBuilder phone(String phone)
	{
		this.phone = phone;
		
		return this;
	}
	
	public PersonBuilder address(String address)
	{
		this.address = address;
		
		return this;
	}
	
	public Person build()
	{
		return new Person(this);
	}
}