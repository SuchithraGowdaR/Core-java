package com.xworks.oops.inheritance;

public class VehicleBike extends VehicleCar {
	public String brand;
	public String model;
	public float price;
	
	public VehicleBike() {
		
	}
	

	public void speed(float sp) {
	System.out.println("Engine: "+sp);
	}
	public void power() {
	System.out.println("Max Power: 34ps@9700rpm");
	
	}

	public void bike(String brand,String model,float price) {
	this.brand=brand;
	this.model=model;
	this.price=price;
	System.out.println("Brand: "+brand+"\n"+"Model: "+model+"\n"+"Price: "+price);
	
	}
	}