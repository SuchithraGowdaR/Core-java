package com.xworkz.exceptionapp;

import java.util.Scanner;

public class MltplExcpCatch {
	public static void main(String[] args) {
		System.out.println("main method strated");
		
			Scanner scn=new Scanner(System.in);
			System.out.println("enter name");
			String name=scn.nextLine();
			
			long phnnum=Long.parseLong(name);
			System.out.println("phone number: "+phnnum);
		try {	
		 int [] a=new int [5];
		  a[0]=9;
		  a[1]=7;
		  a[2]=4;
		  a[3]=8;
		  a[4]=8;
		 // a[5]=8;
		  for(int i=0 ; i<a.length ; i++) {
			  System.out.println(a[i]);
		  }
		
		  
		  String st=null;
		  String str="null";
		  System.out.println(st.equals(str));
		  
		  Class.forName("com.xworkz.exceptionapp.OneTryMulCatch");
		}catch( Exception e) {
			e.printStackTrace();
			}
		
		System.out.println("main method ended"); 
	}


}
