package com.xworks.oops.inheritance;

public class NormalTrain {
	public int noOfCompartment;
	public int enginCapacity;
	public String name;
	
	public NormalTrain() {
		
	}
	public void speed() {
		System.out.println("200kmph");
	}
	public void typeOfTransport() {
		System.out.println("train cant provid door to door service");
	}
	public void nTrain(int noc,int ec,String name) {
		noOfCompartment=noc;
		enginCapacity=ec;
		this.name=name;
		System.out.println("Number of Compartmenr: "+noOfCompartment+"\n"+"Engin Capcity: "+enginCapacity+"cc"+"\n"+"Name: "+name);
		
		
	}

}
