package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class Tester {
	
	public static void main(String[] args) {
		
		Collection collection= new ArrayList();
		collection.add(128);
		collection.add(32000);
		collection.add(185000);
		collection.add(9876543210l);
		collection.add(562.369f);
		collection.add(65815.5873547);
		collection.add('S');
		collection.add("Namaskara");
			System.out.println(collection.size()); // to know the length or size of collection 
		collection.remove('S');
			System.out.println(collection.size());
		
				System.out.println("fetching the objects from collectin");
				System.out.println("fetching the objects with forEach()(method)");
		collection.forEach(System.out::println); // forEach() Implementation added in  java 8(jdk 1.8) 
		//or
				System.out.println("fetching the objects with for each");
		for (Object object : collection) { //for each is A way to fetch the data
			System.out.println(object);
		}
	}
}
