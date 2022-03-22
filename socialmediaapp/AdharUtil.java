package com.xworks.socialmediaapp;

import java.util.Scanner;

import com.xworks.socialmediaapp.dto.AdharDTO;

public class AdharUtil {
	
	
	public static void main(String[] ar) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scn.next();
		System.out.println("Enter dob");
		String dob=scn.next();
		System.out.println("Enter adress");
		String ads=scn.next();
		System.out.println("Enter adhar card num");
		long num=scn.nextLong();
		
		
		
		
		AdharDTO adhar=new AdharDTO();
		adhar.setName(name);
		adhar.setDto(dob);
		adhar.setAdress(ads);
		adhar.setAdharNum(num);
		System.out.println(adhar);
		
		AdharDTO adhar1=new AdharDTO();
			
		adhar1.setName("Sachin Gowda");
		adhar1.setDto("21/04/2001");
		adhar1.setAdress("Ramanagara-562159");
		adhar1.setAdharNum(235698125812l);
		System.out.println(adhar1);
			
	}
}
