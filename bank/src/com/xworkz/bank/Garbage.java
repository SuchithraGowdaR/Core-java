package com.xworkz.bank;

public class Garbage {
	public void finalize() {System.out.println("Object is garbage collected");}
	public static void main(String[] args) {
		Garbage a=new Garbage();
		Garbage b=new Garbage();
		
		a=null;
		b=null;
		System.gc();
	}

}
