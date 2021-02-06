package com.br.impl.commands;

import com.br.interfaces.ICommand;
import com.br.receivers.ImageReceiver;

public class MakeSepiaCommand implements ICommand {

	private ImageReceiver imageReceiver;

	public MakeSepiaCommand(ImageReceiver imageReceiver) {
		this.imageReceiver = imageReceiver;
	}

	@Override
	public void execute() {
		this.imageReceiver.setIsSepia(true);
		System.out.println("The picture is now in sepia tone");
	}

	@Override
	public void unExecute() {
		this.imageReceiver.setIsSepia(false);
		System.out.println("Sepia undo. The picture is now back with their original tone");
	}

}
