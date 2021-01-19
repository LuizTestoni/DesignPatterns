package br.com.strategy_pattern.strategies;

import br.com.strategy_pattern.strategies.interfaces.IRideStrategy;

public class MTBRideStrategy implements IRideStrategy {

	@Override
	public String ride() {
		return "Ride on all terrain";
	}

}
