package com.mauriciotogneri.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		List<Memento> savedStates = new ArrayList<Memento>();
		
		Originator originator = new Originator();
		originator.set("State1");
		originator.set("State2");
		savedStates.add(originator.saveToMemento());
		originator.set("State3");
		savedStates.add(originator.saveToMemento());
		originator.set("State4");
		originator.restoreFromMemento(savedStates.get(1));
	}
}