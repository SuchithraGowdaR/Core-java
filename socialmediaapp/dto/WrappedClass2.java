package com.xworks.socialmediaapp.dto;

public class WrappedClass2 {
	public static void main(String[] args) {
		
		int i=10; //14/3/22
		Integer i1=i; //auto-boxing
		System.out.println(i1.toString());
		System.out.println(i1.hashCode());
		
		short ty=56;
		Short y1=ty;
		System.out.println(y1.toString());
		System.out.println(y1.hashCode());
		
		byte sg=22;
		Byte g1=sg;
		System.out.println(g1.toString());
		System.out.println(g1.hashCode());
		
		long g=1258;
		Long g2=g;
		System.out.println(g2.toString());
		System.out.println(g2.hashCode());
		
		float price=56.25f;
		Float pr=price;
		System.out.println(pr.toString());
		System.out.println(pr.hashCode());
		
		double it=25.562;
		Double it1=it;
		System.out.println(it1.toString());
		System.out.println(it1.hashCode());
		
		char ch='k';
		Character nm1=ch;
		System.out.println(nm1.toString());
		System.out.println(nm1.hashCode());
		
		boolean hy=true;
		Boolean hy1=hy;
		System.out.println(hy1.toString());
		System.out.println(hy1.hashCode());
		
		
		
		//Unboxing
		Integer integer=10;
		int integer1=integer; //auto-unboxing
		System.out.println(integer1);
				
		Byte by=108;
		byte by1=by.byteValue(); //manual unboxing
		System.out.println(by1);
		
		Short sh=32000;
		short sh1=sh.shortValue();
		System.out.println(sh1);
		
		Long lng=16025l;
		long lng1=lng.longValue();
		System.out.println(lng1);
		
		Float flt=25.3698f;
		float flt1=flt.floatValue();
		System.out.println(flt1);
		
		Double dl=652.4891;
		double dl1=dl.doubleValue();
		System.out.println(dl1);
		
		Character cht='H';
		char ch1=cht.charValue();
		System.out.println(ch1);
		
		Boolean bl=false;
		boolean bl1=bl.booleanValue();
		System.out.println(bl1);
		
		
		
		
		
		
		
		
	}

}
