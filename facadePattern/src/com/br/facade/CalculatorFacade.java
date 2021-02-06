package com.br.facade;

import com.br.impl.Calculator;
import com.br.impl.NumberA;
import com.br.impl.NumberB;
import com.br.impl.Operation;
import com.br.impl.Operation.op;

public class CalculatorFacade {
	
	private Calculator calc = new Calculator();
	
	public void sum(Long a, Long b) {
		NumberA numberA = new NumberA();
		numberA.setNumberA(a);
		
		NumberB numberB = new NumberB();
		numberB.setNumberB(b);
		
		Operation operation = new Operation();
		operation.setCurrentOperation(op.SUM);
		
		calc.calculate(numberA, numberB, operation);
	}
	
	public void subtract(Long a, Long b) {
		NumberA numberA = new NumberA();
		numberA.setNumberA(a);
		
		NumberB numberB = new NumberB();
		numberB.setNumberB(b);
		
		Operation operation = new Operation();
		operation.setCurrentOperation(op.SUBTRACTION);
		
		calc.calculate(numberA, numberB, operation);
	}
}
