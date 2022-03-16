package com.xworkz.bank;

import com.xworkz.bankDetails;

public class Bank {
	
	public static void main(String []ar) {
		
	String	rsl =bankDetails.name;
		System.out.println(rsl);
		
	long acc=bankDetails.accountnum;
	System.out.println(acc);
	
	char ch=rsl.charAt(3);
		System.out.println(ch);
	int ind=rsl.indexOf( "hi" );
		System.out.println("indexOf hi is: "+ind);
	int indx=rsl.indexOf("hello dude");
		System.out.println(indx);
	boolean isIt=rsl.isEmpty();
		System.out.println("is it Empty:"+isIt);
	int lng=rsl.length();
			System.out.println("Length of this String:"+lng);
	String rpl=rsl.replace("a", "l");
		System.out.println(rpl);
	String rpl1=rsl.replace("B", "P");
		System.out.println(rpl1);
	String upCs=rsl.toUpperCase();
		System.out.println(upCs);
	String lwCs=rsl.toLowerCase();
		System.out.println(lwCs);
	
	
	boolean num=rsl.isEmpty();
		System.out.println("Is It Empty:"+num);
	int lngOne=rsl.length();
		System.out.println("Length of this String:" +lngOne);
			
		
		
	}
	

}
