package com.xworks.oops;

import com.xworks.oops.inheritance.BulletTrain;
import  com.xworks.oops.inheritance.NammaMetro;

public class TrainTester {
	public static void main(String []ar) {
	BulletTrain	btrain=new BulletTrain();
	btrain.SpeedLine();
	btrain.bTrin("500kmph", 1964);
	btrain.benefits("Less smog in the city", "ReverseSprawl", "safer that driving");
	btrain.speed();
	btrain.typeOfTransport();
	btrain.nTrain(20, 250, "Rani Chennama");
	
	NammaMetro metro= new NammaMetro();
	metro.owner();
	metro.lineColor("The eastwest corridor in named Purple Line", "The northernmost corridor is named Green Line");
	metro.nMetro(8, 80, 518074);
	metro.speed();
	metro.typeOfTransport();
	metro.nTrain(20, 250, "Rani Chennama");
	}

}
