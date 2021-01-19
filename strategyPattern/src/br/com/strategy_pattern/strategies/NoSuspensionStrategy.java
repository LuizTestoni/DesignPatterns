package br.com.strategy_pattern.strategies;

import br.com.strategy_pattern.strategies.interfaces.ISuspensionStrategy;

public class NoSuspensionStrategy implements ISuspensionStrategy {

	@Override
	public String type() {
		return "No suspension";
	}
}
