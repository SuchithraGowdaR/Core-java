package com.xworkz.collectionapp;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.dto.PaintDTO;

public class PaintTester {
	public static void main(String[] args) {
		Set set=new TreeSet();
		
		set.add(new PaintDTO(1112,"Asian","Wall paint","light skyblue","5 ltr"));
		set.add(new PaintDTO(1115,"nippon","Wall paint","light skyblue","5 ltr"));
		set.add(new PaintDTO(1113,"Dulux","Wall paint","light skyblue","5 ltr"));
		set.add(new PaintDTO(1114,"Exce","Wall paint","light skyblue","5 ltr"));
		
		set.forEach(System.out::println);
	}

}
