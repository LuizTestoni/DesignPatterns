package br.com.strategy_pattern.strategies;

import br.com.strategy_pattern.strategies.interfaces.IRideStrategy;

public class GravelRideStrategy implements IRideStrategy {

	@Override
	public String ride() {
		return "Ride on almost all terrain";
	}

}
