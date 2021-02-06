package com.br.impl.commands;

import com.br.interfaces.ICommand;
import com.br.receivers.ImageReceiver;

public class MakeBlackAndWhiteCommand implements ICommand{
	
	private ImageReceiver imageReceiver;
	
	public MakeBlackAndWhiteCommand(ImageReceiver imageReceiver) {
		this.imageReceiver = imageReceiver;
	}

	@Override
	public void execute() {
		this.imageReceiver.setIsBlackAndWhite(true);
		System.out.println("The picture is now black and white");
	}

	@Override
	public void unExecute() {
		this.imageReceiver.setIsBlackAndWhite(false);
		System.out.println("Black and white undo. The picture is now back with their original color");
	}

}
