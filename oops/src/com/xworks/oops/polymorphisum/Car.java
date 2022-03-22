package com.xworks.oops.polymorphisum;

public class Car {
	public void stop(){
		System.out.println("Car can stop by apllying break & Engin key");
	}
	public void start(){
		System.out.println("car get Started by driver");
	}
	public void drive() {
		System.out.println("U can Drive the car");
	}
	public void turn(String turn) {
	System.out.println();	
	}
	public String maxSpeed() {
		System.out.println("Max Speed 50km/h");
		return "50km/h";
	}
	

}
