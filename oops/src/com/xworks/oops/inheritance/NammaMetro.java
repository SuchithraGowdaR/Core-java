package com.xworks.oops.inheritance;

public class NammaMetro extends NormalTrain {
	public int noOfCabin;
	public int speed;
	public int dailyRidership;
	
	public NammaMetro() {
		
	}

	public void owner() {
		System.out.println("Banglore metro Rail Corporation Lit(BMRCL) is Owner of Namma Metro");
	}
	public void lineColor(String purple,String green) {
		System.out.println("Purple Line: "+purple+"\n"+"Green Line"+green+"\n");
	}
	public void nMetro(int noOfCabin,int speed,int dailyRidership){
		this.noOfCabin=noOfCabin;
		this.speed=speed;
		this.dailyRidership=dailyRidership;
		System.out.print("Number of Cabin:"+noOfCabin+"\n"+"Speed: "+speed+"km/h"+"\n"+"Daily Ridership: "+dailyRidership);
	}
}
