package com.br;

import com.br.impl.Adaptee;
import com.br.impl.ConcreteAdapter;
import com.br.interfaces.IAdapter;

public class Client {
	
	/*
	 Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
	 */
	
	public static void main(String[] args) {
		IAdapter adapter = new ConcreteAdapter(new Adaptee());
		adapter.execute("Test", 123);
	}
}
