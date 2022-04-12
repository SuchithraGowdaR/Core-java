package com.xworkz.exceptionapp;

import java.util.Iterator;

public class Basic {
	public static void main(String[] args) {
		System.out.println("main method started");
	//  int a1[] = {1,2,3,4,5};
		
		try {
		int a[] =new int [5];
		a[0]=2;
		a[1]=1;
		a[2]=5;
		a[3]=4;
		a[4]=3;
	//  a[5]=6;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		}catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("cannot add more elements in int array");
		}
		try {
			String st=null;
			String st1="null";
				System.out.println(st.equals(st1));
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("U cannot access null data");
			
		}
		System.out.println("main method ended");
	}
}