package com.xworkz.collectionapp;

import java.util.Set;
import java.util.TreeSet;
import com.xworkz.dto.DvdDTO;

public class DvdTester {
	public static void main(String[] args) {
		Set set=new TreeSet();
		
		set.add(new DvdDTO(102,"4.7Gb","16grm"));
		set.add(new DvdDTO(103,"8.5Gb","16.5grm"));
		set.add(new DvdDTO(104,"9.4Gb","17grm"));
		
		set.forEach(System.out::println);
	}
}
