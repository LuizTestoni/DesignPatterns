package com.br;

import com.br.facade.CalculatorFacade;

public class Client {
	
	/*
	 Facade is a structural design pattern that provides a simplified interface to a library, 
	 a framework, or any other complex set of classes.
	 */
	
	public static void main(String[] args) {
		// Uses the facade to make the call, this way the client don't need to know all the objects 
		// required by the calculator interface. 
		CalculatorFacade calcFacade = new CalculatorFacade();
		
		calcFacade.sum(5L, 3L);
		calcFacade.subtract(10L, 5L);
	}
}
