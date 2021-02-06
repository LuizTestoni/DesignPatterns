package com.br.impl.invokers;

import java.util.ArrayList;

import com.br.interfaces.ICommand;

public abstract class UndoButton {
	
	public static void click(ArrayList<ICommand> commandHistory) {
		if (commandHistory.size() == 0) {
			System.out.println("There is no commands to undo");
			
		} else {
			int i = commandHistory.size() -1;
			commandHistory.get(i).unExecute();
			commandHistory.remove(i);
		}
	}
}
