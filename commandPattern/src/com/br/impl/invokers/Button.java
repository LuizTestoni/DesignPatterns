package com.br.impl.invokers;

import java.util.ArrayList;

import com.br.interfaces.ICommand;

public class Button {
	
	private ICommand command;
	private ArrayList<ICommand> commandHistory;

	public Button(ICommand c, ArrayList<ICommand> ch) {
		this.command = c;
		this.commandHistory = ch;
	}
	
	public void click() {
		this.command.execute();
		this.commandHistory.add(this.command);
	}
}
