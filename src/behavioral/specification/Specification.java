package behavioral.specification;

public interface Specification<Type>
{
	public boolean isSatisfiedBy(Type candidate);
	
	public Specification<Type> and(Specification<Type> other);
	
	public Specification<Type> or(Specification<Type> other);
	
	public Specification<Type> not();
}