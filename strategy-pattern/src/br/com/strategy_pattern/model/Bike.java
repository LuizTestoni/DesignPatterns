package br.com.strategy_pattern.model;

import br.com.strategy_pattern.strategies.interfaces.IDisplayStrategy;
import br.com.strategy_pattern.strategies.interfaces.IRideStrategy;
import br.com.strategy_pattern.strategies.interfaces.ISuspensionStrategy;

public class Bike {
	
	private IRideStrategy ride;
	private ISuspensionStrategy suspension;
	private IDisplayStrategy display;
	
	public Bike(IRideStrategy ride, ISuspensionStrategy suspension, IDisplayStrategy display) {
		this.ride = ride;
		this.suspension = suspension;
		this.display = display;
	}

	public String getRide() {
		return ride.ride();
	}

	public String getSuspension() {
		return suspension.type();
	}

	public String getDisplay() {
		return display.display();
	}
}
