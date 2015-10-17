package com.mauriciotogneri.designpatterns.behavioral.interpreter;

import java.util.Stack;

public class Evaluator implements Expression
{
    private final Expression syntaxTree;

    public Evaluator(String expression)
    {
        Stack<Expression> expressionStack = new Stack<Expression>();
        String[] tokens = expression.split(" ");

        for (String token : tokens)
        {
            if (token.equals("+"))
            {
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();
                Expression subExpression = new Plus(left, right);
                expressionStack.push(subExpression);
            }
            else if (token.equals("-"))
            {
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();
                Expression subExpression = new Minus(left, right);
                expressionStack.push(subExpression);
            }
            else
            {
                expressionStack.push(new Variable(token));
            }
        }
        this.syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Context context)
    {
        return this.syntaxTree.interpret(context);
    }
}