package br.com.strategy_pattern.test;

import br.com.strategy_pattern.model.Bike;
import br.com.strategy_pattern.model.factory.BikeFactory;
import br.com.strategy_pattern.strategies.CleanDisplayStrategy;
import br.com.strategy_pattern.strategies.DirtyDisplayStrategy;
import br.com.strategy_pattern.strategies.FullSuspensionStrategy;
import br.com.strategy_pattern.strategies.GravelRideStrategy;
import br.com.strategy_pattern.strategies.HardTailSuspensionStrategy;
import br.com.strategy_pattern.strategies.MTBRideStrategy;
import br.com.strategy_pattern.strategies.NoSuspensionStrategy;
import br.com.strategy_pattern.strategies.RoadRideStrategy;

public class CreateBikeTest {

	public static void main(String[] args) {
		Bike roadBike = BikeFactory.getBike(RoadRideStrategy.class, NoSuspensionStrategy.class, CleanDisplayStrategy.class);
		
		System.out.println("Ride: " + roadBike.getRide());
		System.out.println("Suspension: " + roadBike.getSuspension());
		System.out.println("Display: " + roadBike.getDisplay());
		System.out.println("========================");
		
		
		Bike gravel = BikeFactory.getBike(GravelRideStrategy.class, NoSuspensionStrategy.class, DirtyDisplayStrategy.class);
		
		System.out.println("Ride: " + gravel.getRide());
		System.out.println("Suspension: " + gravel.getSuspension());
		System.out.println("Display: " + gravel.getDisplay());
		System.out.println("========================");
		
		Bike MTBFullSuspension = new Bike(new MTBRideStrategy(), new FullSuspensionStrategy(), new DirtyDisplayStrategy());
		
		System.out.println("Ride: " + MTBFullSuspension.getRide());
		System.out.println("Suspension: " + MTBFullSuspension.getSuspension());
		System.out.println("Display: " + MTBFullSuspension.getDisplay());
		System.out.println("========================");
		
		Bike MTBHardTail = new Bike(new MTBRideStrategy(), new HardTailSuspensionStrategy(), new DirtyDisplayStrategy());
		
		System.out.println("Ride: " + MTBHardTail.getRide());
		System.out.println("Suspension: " + MTBHardTail.getSuspension());
		System.out.println("Display: " + MTBHardTail.getDisplay());
		System.out.println("========================");
	}
}
