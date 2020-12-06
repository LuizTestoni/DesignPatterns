package br.com.strategy_pattern.strategies;

import br.com.strategy_pattern.strategies.interfaces.IDisplayStrategy;

public class DirtyDisplayStrategy implements IDisplayStrategy {

	@Override
	public String display() {
		return "Dirty bike";
	}

}
