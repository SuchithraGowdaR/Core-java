package com.xworks.oops.inheritance;

public class VehicleTruck extends VehicleBike {
	public int weel;
	public int enginCapacity;
	public String name;
	
	public VehicleTruck () {
		
	}
	public void capacity() {
		System.out.println("it can carry more than 1ton");
	}
	public void use() {
		System.out.println("Trucks plays a big role in transportation of material one place to another place");
	}
	public void vTruck(String name,int weel,int enginCapacity) {
		this.name=name;
		this.weel=weel;
		this.enginCapacity=enginCapacity;
		System.out.println("Name: "+name+"\n"+"Number of Weels: "+weel+"\n"+"Engin Capacity: "+enginCapacity+"cc");
	}
}
