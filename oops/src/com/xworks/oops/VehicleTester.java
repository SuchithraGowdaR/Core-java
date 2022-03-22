package com.xworks.oops;

import com.xworks.oops.inheritance.VehicleBike;
import com.xworks.oops.inheritance.VehicleTruck;


public class VehicleTester {
	public static void main(String[] ar) {
		VehicleBike bike= new VehicleBike();
		bike.bike("TVS", "ApacheRR310", (float) 2.59);
		bike.speed(159.7f);
		bike.power();
		bike.brand("Range Rover", "Evoque");
		bike.vcar("Automatic", "Black", 300, 66, 6, 1997);
		bike.seat();
		
		VehicleTruck truck= new VehicleTruck();
		truck.speed(159.7f);
		truck.power();
		truck.bike("TVS","ApacheRR310", 2.59f);
		truck.capacity();
		truck.vTruck("Truck", 8, 1500);
		
		}

}
