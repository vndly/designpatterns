package com.mauriciotogneri.designpatterns.behavioral.templatemethod;

public class Main
{
    public static void main(String[] args)
    {
        Monopoly monopoly = new Monopoly();
        monopoly.start();

        Chess chess = new Chess();
        chess.start();
    }
}