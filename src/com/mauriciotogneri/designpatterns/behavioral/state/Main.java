package com.mauriciotogneri.designpatterns.behavioral.state;

public class Main
{
    public static void main(String[] args)
    {
        StateContext stateContext = new StateContext();

        stateContext.writeName("Monday");
        stateContext.writeName("Tuesday");
        stateContext.writeName("Wednesday");
        stateContext.writeName("Thursday");
        stateContext.writeName("Friday");
        stateContext.writeName("Saturday");
        stateContext.writeName("Sunday");
    }
}