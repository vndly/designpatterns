package com.mauriciotogneri.designpatterns.behavioral.specification;

public class NotSpecification<Type> extends CompositeSpecification<Type>
{
    private final Specification<Type> specification;

    public NotSpecification(Specification<Type> other)
    {
        this.specification = other;
    }

    @Override
    public boolean isSatisfiedBy(Type candidate)
    {
        return !this.specification.isSatisfiedBy(candidate);
    }
}