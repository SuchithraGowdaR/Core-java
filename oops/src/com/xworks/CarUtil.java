package com.xworks;
import com.xworks.oops.polymorphisum.SportCar;

public class CarUtil {
	public static void main(String[] args) {
		SportCar car=new SportCar();
		car.turn("U-Turn");
		car.start();
		car.stop();
		car.drive();
		car.maxSpeed();
	}

}
