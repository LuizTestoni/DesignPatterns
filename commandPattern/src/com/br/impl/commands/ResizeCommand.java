package com.br.impl.commands;

import com.br.interfaces.ICommand;
import com.br.receivers.ImageReceiver;

public class ResizeCommand implements ICommand{

	private ImageReceiver imageReceiver;
	
	public ResizeCommand(ImageReceiver imageReceiver) {
		this.imageReceiver = imageReceiver;
	}	
	
	@Override
	public void execute() {
		this.imageReceiver.setIsResized(true);
		System.out.println("The picture is now resized");
	}

	@Override
	public void unExecute() {
		this.imageReceiver.setIsResized(false);
		System.out.println("Undo resize. The picture is back to their original size.");
	}

}
