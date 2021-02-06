package com.br.impl;

import com.br.interfaces.IAdapter;

public class ConcreteAdapter implements IAdapter {
	
	private Adaptee adaptee;

	public ConcreteAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}	

	@Override
	public void execute(String paramA, Integer paramB) {
		adaptee.execute(paramB, paramA);
	}
}
