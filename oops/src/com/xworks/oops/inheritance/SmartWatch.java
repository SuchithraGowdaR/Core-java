package com.xworks.oops.inheritance;

public class SmartWatch extends Watch {
	public int noOfButton;
	public byte noOfFeatures;
	
	public SmartWatch() {
		System.out.println("Invoking smart Watch constructor");
	}
	
	public void cllaing(){
		System.out.println("You can make call and recive");
	}
	
	public void steAlaram(String time){
		System.out.printf("Alaram set: "+time);
	}
	public void sWatch(int nob,byte nof) {
		noOfButton=nob;
		noOfFeatures=nof;
		System.out.println("Number of Buttons: "+noOfButton+"\n"+"Numbers of Fetures: "+noOfFeatures);
		
	}
	

}
