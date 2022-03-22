package com.xworks.oops.inheritance;

public class VehicleCar{
	
	private String headLamp;
	private String colour;
	private int mxSpeed;
	private int price;
	private int numOgGear;
	private float enginCapacity;
	
	public  VehicleCar(){
	}
	public void seat() {
		System.out.println("It has 5 Seat with seat belt and AirBags");
	}
	public void brand(String brand, String modale) {
		System.out.println("Brand: "+ brand+"\n"+"modale: "+modale);
	}
	public void vcar(String headLamp,String colour,int mxSpeed,int price,int numOgGear, float enginCapacity){
		this.headLamp=headLamp;
		this.colour=colour;
		this.mxSpeed=mxSpeed;
		this.price=price;
		this.numOgGear=numOgGear;
		this.enginCapacity=enginCapacity;
		
		
		System.out.println("Head Lamp: "+headLamp+"\n"+"Colour: "+colour+"\n"+"Maximum Speed: "+mxSpeed+"km/h"+"Price: "+price+"lack"+"\n"+"Number of Gear: "+ numOgGear+"\n"+"Engin Capcity: "+enginCapacity+"cc");
		
	}
}