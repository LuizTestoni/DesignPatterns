package br.com.strategy_pattern.strategies;

import br.com.strategy_pattern.strategies.interfaces.ISuspensionStrategy;

public class HardTailSuspensionStrategy implements ISuspensionStrategy {

	@Override
	public String type() {
		return "Front suspension (only fork)";
	}

}
