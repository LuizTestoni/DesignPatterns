package br.com.strategy_pattern.strategies;

import br.com.strategy_pattern.strategies.interfaces.IDisplayStrategy;

public class CleanDisplayStrategy implements IDisplayStrategy {

	@Override
	public String display() {
		return "Shine clean bike";
	}
}
