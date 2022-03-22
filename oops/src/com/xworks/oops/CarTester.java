package com.xworks.oops;

import  com.xworks.oops.encapsulation.CarDTO;

public class CarTester {
	public static void main(String[] ar) {
	CarDTO Hey=new CarDTO();
	
	Hey.setBrand("Range Rover");
	String brand=Hey.getBrand();
	System.out.println("Brand: "+brand);
	
	Hey.setModale("Evoque");
	String modale=Hey.getModale();
	System.out.println("Modale:  "+modale);
	
	Hey.setHeadLamp("Automatic");
	String lamp=Hey.getHeadLamp();
	Hey.setColour("Silicon Silver");
	String colour=Hey.getColour();
	System.out.println("Head Lamp: "+lamp+"\n"+"Colour: "+colour);
	
	Hey.setMxspeed(300 );
	int spd=Hey.getMxspeed();
	Hey.setSeat(5);
	int st=Hey.getSeat();
	Hey.setAirBag(4 );
	int ab=Hey.getAirBag();
	Hey.setPrice(66);
	int pr=Hey.getPrice();
	Hey.setNumOgGear(6);
	int gear=Hey.getNumOgGear();
	System.out.println("Mx Speed: "+spd+"km/h"+"\n"+"Number Of Seat: "+st+"\n"+"Air Bag: "+ab+"\n"+"Price: "+ pr+"\n"+"Number Of Gear: "+ gear);
	Hey.setEnginCapacity(1997);
	float ec=Hey.getEnginCapacity();
	System.out.println("Engin Capcity: "+ec+"cc");
	
	

	}

}
