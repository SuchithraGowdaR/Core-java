package com.xworks.oops.polymorphisum;

public class SportCar extends Car {
	public void drift() {
		System.out.println("You cans drift the car");
	}
	public void safty() {
		System.out.println("Air Bag");
	}
	@Override
	public String maxSpeed() {
		System.out.println("Max Speed 100km/h");
		return "100km/h";
	
	}
}
