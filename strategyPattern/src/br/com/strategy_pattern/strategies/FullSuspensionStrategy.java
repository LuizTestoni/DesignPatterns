package br.com.strategy_pattern.strategies;

import br.com.strategy_pattern.strategies.interfaces.ISuspensionStrategy;

public class FullSuspensionStrategy implements ISuspensionStrategy {

	@Override
	public String type() {
		return "Full suspension (fork and frame)";
	}

}
