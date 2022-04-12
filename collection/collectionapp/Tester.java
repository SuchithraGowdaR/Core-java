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
				/*System.out.println("fetching the objects with forEach()(method)");
		collection.forEach(System.out::println);  */ // forEach() Implementation added in  java 8(jdk 1.8) 
		//or
				System.out.println("fetching the objects with for each");
		for (Object object : collection) { //for each is A way to fetch the data
			System.out.println(object);
		}
		
		
		 Collection collection1= new ArrayList();
		 System.out.println(collection1.isEmpty());
		 
		 System.out.println("added the all data of collection to collection1 by using add() ");
		 collection1.addAll(collection);
		 System.out.println(collection1.isEmpty());
		 
		 
			System.out.println("fetching the objects with for each");
			for (Object object : collection1) {
			 System.out.println(object);
			}
			
			/*collection1.removeAll(collection1);
			System.out.println("fetching the objects with for each");
			for (Object object : collection1) {
			 System.out.println(object); 
			} 
			
			collection1.clear();
			System.out.println("fetching the objects with for each");
			for (Object object : collection1) {
			 System.out.println(object); 
			} 
			
			collection1.hashCode();
			System.out.println("fetching the objects with for each");
			for (Object object : collection1) {
			 System.out.println(object);
			}
			
			collection.containsAll(collection);
			System.out.println("fetching the objects with for each");
			for (Object object : collection1) {
			 System.out.println(object);
			} */
			
			/*in Object array we can have dinamic data
			Object object[]=new Object[5];
			object[0]=128;
			object[1]=30255;
			object[2]="";
			object[3]='b'; */
			
			System.out.println("fetching collection data by for loop");
			Object object1[]=collection.toArray();
			for (int i = 0; i < object1.length; i++) {
				System.out.println(object1[i]);
			}
			
	}
}
