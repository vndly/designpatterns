package com.mauriciotogneri.designpatterns.behavioral.specification;

public class OrSpecification<Type> extends CompositeSpecification<Type>
{
	private final Specification<Type> left;
	private final Specification<Type> right;
	
	public OrSpecification(Specification<Type> left, Specification<Type> right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean isSatisfiedBy(Type candidate)
	{
		return this.left.isSatisfiedBy(candidate) || this.right.isSatisfiedBy(candidate);
	}
}