package com.mauriciotogneri.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Switch
{
    private final List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command command)
    {
        this.history.add(command);
        command.execute();

        System.out.println("Commands stored: " + this.history.size());
    }
}