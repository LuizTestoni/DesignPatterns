package com.br.impl;

public class Operation {
	
	public enum op {
		SUM,
		SUBTRACTION;
	}
	
	private op CurrentOperation;

	public op getCurrentOperation() {
		return CurrentOperation;
	}

	public void setCurrentOperation(op currentOperation) {
		CurrentOperation = currentOperation;
	}
}
