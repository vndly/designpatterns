package com.mauriciotogneri.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements Mediator
{
    private final List<User> users = new ArrayList<>();

    public void addUser(User user)
    {
        this.users.add(user);
    }

    @Override
    public void send(String message, User sender)
    {
        for (User user : this.users)
        {
            if (user != sender)
            {
                user.receive(message);
            }
        }
    }
}