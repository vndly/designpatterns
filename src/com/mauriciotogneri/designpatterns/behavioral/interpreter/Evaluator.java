package com.mauriciotogneri.designpatterns.behavioral.interpreter;

import java.util.Stack;

public class Evaluator implements Expression
{
    private final Expression syntaxTree;

    public Evaluator(String expression)
    {
        Stack<Expression> expressionStack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens)
        {
            switch (token)
            {
                case "+":
                {
                    Expression right = expressionStack.pop();
                    Expression left = expressionStack.pop();
                    Expression subExpression = new Plus(left, right);
                    expressionStack.push(subExpression);
                    break;
                }

                case "-":
                {
                    Expression right = expressionStack.pop();
                    Expression left = expressionStack.pop();
                    Expression subExpression = new Minus(left, right);
                    expressionStack.push(subExpression);
                    break;
                }

                default:
                {
                    expressionStack.push(new Variable(token));
                    break;
                }
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