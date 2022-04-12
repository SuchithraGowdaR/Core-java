package com.xworkz.collectionapp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
	public static void main(String[] args) {
		
		Set set= new TreeSet();
		set.add("zaheer");
		set.add("Laxmi");
		set.add("65987465l");
		set.add("1");
		set.add("prakash P");
		set.add("32000");
		set.add("Akshay");
		set.add("adhi");
		set.add("prakash");
		set.add("sureya");
		set.add("sureya");
		set.add("sureya");
		//set.add(null);
		
		for (Object object : set) {
			System.out.println(object);
		}
		System.out.println("Fetching the the data by forEach method");
		set.forEach(System.out::println);
		
		
	}

}
