package creational.builder.bad;

public class Main
{
	public static void main(String[] args)
	{
		Person person1 = new Person("Bob", "Williams");
		System.out.println(person1);
		
		Person person2 = new Person("Bob", "Williams", 45);
		System.out.println(person2);
		
		Person person3 = new Person("Bob", "Williams", 45, 82.7f);
		System.out.println(person3);
		
		Person person4 = new Person("Bob", "Williams", 45, 82.7f, "1234567890");
		System.out.println(person4);
		
		Person person5 = new Person("Bob", "Williams", 45, 82.7f, "1234567890", "Fake Street 123");
		System.out.println(person5);
	}
}