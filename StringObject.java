package com.xworkz.bank;

public class StringObject {//in java String object can be created in two ways 
	public static void main(String[] args) {
		//String Literals **String objects are immutable(not modify)
		//String name="gowda";
		//Using new key word
		//String name1=new String();
		
		String  s ="gowda";
		String  s1="gowda";
		
		
		String s2=new String("gowdacx");
		System.out.println(s==s2);
		s2="gowda";
		//System.out.println(s==s1);
		//System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		
		String n="null";
		String n1=null ;
		//System.out.println(n1.equalsIgnoreCase(n)); //NullPointerException is available in java.lang method
		//System.out.println(n.equalsIgnoreCase(n1));
		//System.out.println(n1.equals(n));
	}

}
