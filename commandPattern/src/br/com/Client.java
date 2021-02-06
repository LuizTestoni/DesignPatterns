package br.com;

import java.util.ArrayList;
import java.util.Scanner;

import com.br.impl.commands.MakeBlackAndWhiteCommand;
import com.br.impl.commands.MakeSepiaCommand;
import com.br.impl.commands.ResizeCommand;
import com.br.impl.invokers.Button;
import com.br.impl.invokers.UndoButton;
import com.br.interfaces.ICommand;
import com.br.receivers.ImageReceiver;

public class Client {
	
	/*
	 Command is a behavioral design pattern that turns a request into a stand-alone object
	 that contains all information about the request.
	 This transformation lets you parameterize methods with different requests,
	 delay or queue a request’s execution, and support undoable operations.
	 */
	
	public static void main(String[] args) {
		ArrayList<ICommand> commandHistory = new ArrayList<>();
		
		ImageReceiver imageReceiver = new ImageReceiver();
		
		MakeBlackAndWhiteCommand blackAndWhite = new MakeBlackAndWhiteCommand(imageReceiver);
		Button button1 = new Button(blackAndWhite, commandHistory);
		
		MakeSepiaCommand sepia = new MakeSepiaCommand(imageReceiver);
		Button button2 = new Button(sepia, commandHistory);
		
		ResizeCommand resize = new ResizeCommand(imageReceiver);
		Button button3 = new Button(resize, commandHistory);
		
		Scanner scnr = new Scanner(System.in);
		String input = "";
		
		System.out.println("Select a option: ");
		System.out.println("Button 1: 1");
		System.out.println("Button 2: 2");
		System.out.println("Button 3: 3");
		System.out.println("Undo last action: U");
		System.out.println("Exit: X");
		while (input.compareToIgnoreCase("X") != 0) {
			
			input = scnr.nextLine();
			
			switch (input) {
			case "1": {
				button1.click();
				break;
			}
			case "2":{
				button2.click();
				break;
			}
			case "3": {
				button3.click();
				break;
			}
			case "U": {
				UndoButton.click(commandHistory);
				break;
			}
			default:
				break;
			}
		}
		
		scnr.close();
	}
}
