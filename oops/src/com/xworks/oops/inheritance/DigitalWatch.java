package com.xworks.oops.inheritance;

public class DigitalWatch extends Watch {
	public byte noOfButtons;
	public String display;
	
	public DigitalWatch() {
		
	}
	
	public void setAlaram(String time) {
		System.out.println("Alaram set: "+time);
		
	}
	public void setTimmer(int hours,int minut) {
		System.out.println("timer set for"+hours+"Hours and"+minut+"Minutes");
	}
	public void dWatch(byte nobtn,String dis) {
	noOfButtons=nobtn;
	display=dis;
	System.out.println("Number of Buttons: "+noOfButtons+"\n"+"Display: "+display);
	}

}
