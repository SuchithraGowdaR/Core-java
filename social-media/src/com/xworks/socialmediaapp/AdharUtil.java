package com.xworks.socialmediaapp;

import com.xworks.socialmediaapp.dto.AdharDTO;

public class AdharUtil {
	
	
	public static void main(String[] ar) {
		
		
		AdharDTO adhar=new AdharDTO();
		adhar.setName("Suchithra");
		adhar.setDto("25/06/1999");
		adhar.setAdress("Ramanagara-562159");
		adhar.setAdharNum(112265893526l);
		System.out.println(adhar);
		
		AdharDTO adhar1=new AdharDTO();
			
		adhar1.setName("Sachin Gowda");
		adhar1.setDto("21/04/2001");
		adhar1.setAdress("Ramanagara-562159");
		adhar1.setAdharNum(235698125812l);
		System.out.println(adhar1);
			
	}
}
