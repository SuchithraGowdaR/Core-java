package com.xworkz.collectionapp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.dto.SampleDTO;

public class SampleTester {
	
	public static void main(String[] args) {
		 Set set= new TreeSet();
		 
		 set.add(new SampleDTO(1));
		 set.add(new SampleDTO(3));
		 set.add(new SampleDTO(2));
		 
		 set.forEach(System.out::println);
		 
	}

}
