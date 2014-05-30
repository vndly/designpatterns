package creational.builder.good;

public class Main
{
	public static void main(String[] args)
	{
		PersonBuilder builder1 = new PersonBuilder("Bob", "Williams");
		Person person1 = builder1.build();
		System.out.println(person1);
		
		PersonBuilder builder2 = new PersonBuilder("Bob", "Williams").age(45);
		Person person2 = builder2.build();
		System.out.println(person2);
		
		PersonBuilder builder3 = new PersonBuilder("Bob", "Williams").age(45).weight(82.7f);
		Person person3 = builder3.build();
		System.out.println(person3);
		
		PersonBuilder builder4 = new PersonBuilder("Bob", "Williams").age(45).weight(82.7f).phone("1234567890");
		Person person4 = builder4.build();
		System.out.println(person4);
		
		PersonBuilder builder5 = new PersonBuilder("Bob", "Williams").age(45).weight(82.7f).phone("1234567890").address("Fake Street 123");
		Person person5 = builder5.build();
		System.out.println(person5);
	}
}