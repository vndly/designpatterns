package com.mauriciotogneri.designpatterns.behavioral.templatemethod;

public abstract class Game
{
    protected abstract void initialize();

    protected abstract void playTurn();

    protected abstract boolean endOfGame();

    protected abstract void printWinner();

    public final void start()
    {
        initialize();

        while (!endOfGame())
        {
            playTurn();
        }

        printWinner();
    }
}