package com.xworkz.exceptionapp;

public class Winding {
	public static void main(String[] args) {
		System.out.println("main method started");
		try {
		m1();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}
	

	private static void m1()throws ClassNotFoundException {
		System.out.println("m1 method started");
		m2();
		System.out.println("m1 method ended");
		
	}

	private static void m2() throws ClassNotFoundException{
		System.out.println("m2 method started");
		m3();
		System.out.println("m2 method ended");
	}

	private static void m3()throws ClassNotFoundException {
		System.out.println("m3 method started");
		m4();
		System.out.println("m3 method ended");
	}

	private static void m4() throws ClassNotFoundException {
		System.out.println("m4 method started");
		Class.forName("com.xworkz.exceptionapp.Windin");
		System.out.println("m4 method ended");
	}

}
