package com.br.impl;

import com.br.impl.Operation.op;

// Really silly class to make a complex input with something trivial, just for example
public class Calculator {
	
	public void calculate(NumberA numberA, NumberB numberB, Operation operation) {
		if (operation.getCurrentOperation() == op.SUM) {
			System.out.println(numberA.getNumberA() + " sum " + numberB.getNumberB() + " equals: " + (numberA.getNumberA() + numberB.getNumberB()));
		}
		
		if (operation.getCurrentOperation() == op.SUBTRACTION) {
			System.out.println(numberA.getNumberA() + " subtract " + numberB.getNumberB() + " equals: " + (numberA.getNumberA() - numberB.getNumberB()));
		}
	}
}
