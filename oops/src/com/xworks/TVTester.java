package com.xworks;

import com.xworks.oops.encapsulation.TVDTO;

public class TVTester {
	
	public static void main(String [] ar) {
		
	TVDTO kodak=new TVDTO();
	
	
	String brand=kodak.getBrand();
	System.out.println(brand);
	kodak.setBrand("Kodak");
	String brandname=kodak.getBrand();
	System.out.println(brandname);
	 
	String model=kodak.getModel();
	System.out.println(model);
	kodak.setModel("Kodak 7XPRO");
	String brandmodel=kodak.getModel();
	System.out.println(brandmodel);
	
	int siz=kodak.getSize();
	System.out.println(siz);
	kodak.setSize( 43 );
	int brandsiz=kodak.getSize();
	System.out.println(brandsiz);
	
	float price=kodak.getPrice();
	System.out.println(price);
	kodak.setPrice(28499.500f);
	float prc=kodak.getPrice();
	System.out.println(prc);
	}
	}
