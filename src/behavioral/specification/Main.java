package behavioral.specification;

public class Main
{
	public static void main(String[] args)
	{
		// ((num % 2) = 0) && ((num >= 0) || !(num > -5))
		Specification<Integer> specification = new IsEven().and(new IsPositive().or(new IsGreaterThan(-5).not()));
		
		System.out.println(specification.isSatisfiedBy(1));
		System.out.println(specification.isSatisfiedBy(-6));
		System.out.println(specification.isSatisfiedBy(-5));
		System.out.println(specification.isSatisfiedBy(8));
		System.out.println(specification.isSatisfiedBy(-2));
	}
}