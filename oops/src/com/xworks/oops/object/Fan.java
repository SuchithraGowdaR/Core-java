package com.xworks.oops.object;

public class Fan {
	public byte noOfWings;
	public String brandName;
	public String colour;
	
	public Fan() {
		System.out.println("Invoking default Fan constructor");
	}
	public Fan(String bname) {
		System.out.println("Invoking single param Fan constructor");
		brandName=bname;
	}
	public Fan(byte nofwings,String bname,String col) {
		this(bname);
		System.out.println("Invoking  three param Fan constructor");
		noOfWings=nofwings;
		colour=col;
	}
	@Override
	public String toString() {
		return "Brand Name: "+brandName+"\t No of Wings: "+noOfWings+"\t Colour: "+colour ;
	}
}
