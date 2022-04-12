package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffBetweenTester {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(1);
		list.add(32000);
		list.add("String");
		list.add('J');
		list.add("Abhi");
		list.add("Zaheer");
		list.add("abhi");
		list.add(null);
		list.add("sushana");
		list.add("sushana");
		list.add("sushana");
		
		System.out.println("fetching the data of ArrayList()");
		list.forEach(System.out::println);
		
		
		Set set=new HashSet();
		set.add(1);
		set.add(32000);
		set.add("String");
		set.add('J');
		set.add("Abhi");
		set.add("Zaheer");
		set.add("abhi");
		set.add(null);
		set.add("sushana");
		set.add("sushana");
		set.add("sushana");
		System.out.println("fetching the data of HashSet()");
		set.forEach(System.out::println);
	}

}
