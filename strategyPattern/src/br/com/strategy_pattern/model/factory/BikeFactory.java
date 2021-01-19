package br.com.strategy_pattern.model.factory;

import java.lang.reflect.InvocationTargetException;

import br.com.strategy_pattern.model.Bike;
import br.com.strategy_pattern.strategies.interfaces.IDisplayStrategy;
import br.com.strategy_pattern.strategies.interfaces.IRideStrategy;
import br.com.strategy_pattern.strategies.interfaces.ISuspensionStrategy;

public class BikeFactory {
	
	public static Bike getBike(Class ride, Class suspension, Class display ) {
		
		Object r = null;
		Object s = null;
		Object d = null;
		
		try {
			r = ride.getDeclaredConstructor().newInstance();
			s = suspension.getDeclaredConstructor().newInstance();
			d = display.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		return new Bike((IRideStrategy) r, (ISuspensionStrategy) s, (IDisplayStrategy) d);
	}
}
