package com.xworkz.bank;

public class Fibanacci {
	public static void main (String []ar) {
		int n1=0,n2=1,n3,i;
	
		for(i=0;i<10;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
			
		}
		
	}

}
