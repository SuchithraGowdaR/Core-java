package com.xworkz.exceptionapp;

public class CharException {
	public static void main(String[] args) {
		System.out.println("main method started");
	
		try {
		char a[]=new char [9];
		a[0]='s';
		a[1]='u';
		a[2]='c';
		a[3]='h';
		a[4]='i';
		a[5]='t';
		a[6]='h';
		a[7]='r';
		a[8]='a';
		//a[9]='R';
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		}catch(Exception a) {
			System.out.println("cannot add more elements in to char array");
		}
		
		try {
			String nm=null;
			String nm1="null";
		System.out.println(nm.equals(nm1));
		}catch(NullPointerException nm) {
			//nm.printStackTrace();
			System.out.println("U cannot access null data");
			
		}
		System.out.println("main method ended");
	}

}
