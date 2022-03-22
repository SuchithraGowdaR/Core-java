package com.xworks.oops.inheritance;

public class Watch {
	public String brand;
	public String color;
	public String shape;
	public float price;
	
	public Watch() {
		System.out.println("Invoking Wtch constructor");
	}
	
	public void showTime() {
		System.out.println("You can see Time in Watch");
	}
	
	public void wear() {
		System.out.println("You can wear the Watch ");
	}
	public void watch(String brand,String color,String shape,Float price) {
		this.brand=brand;
		this.color=color;
		this.shape =shape;
		this.price =price;
		System.out.println("Brand: "+brand+"\n"+"Colour: "+color+"\n"+"Shape: "+shape+"\n"+"Price: "+1500.5);
		
	}

}
