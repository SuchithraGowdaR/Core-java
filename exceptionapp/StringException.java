package com.xworkz.exceptionapp;

public class StringException {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
		String [] nm= new String[5];
		nm[0]="mubhashashira";
		nm[1]="madhu";
		nm[2]="sound";
		nm[3]="mansa";
		nm[4]="kanchana";
		//nm[5]="gagana";
		for(int i=0 ; i < nm.length; i++ ) {
			System.out.println(nm[i]);
		}
		}catch(Exception ar) {
			System.out.println("cannot add more elements in String array");
		}
		try {
			String st=null;
			String st1="null";
			System.out.println(st.equals(st1));
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("U cannot access null data ");
		}
		System.out.println("main method ended");
	}

}
