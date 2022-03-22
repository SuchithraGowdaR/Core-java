package com.xworks.socialmediaapp;

import com.xworks.socialmediaapp.dto.RationCardDTO;


public class RationCardUtil {
	public static void main(String []ar) {
		
	RationCardDTO dto=new RationCardDTO();
	
	dto.setTypeOfCard("APL");
	dto.setIdNum(2564);
	dto.setNumOfMembers(4);
	System.out.println(dto);
	
	RationCardDTO dto1=new RationCardDTO();
	
	dto1.setTypeOfCard("BPL");
	dto1.setIdNum(2100);
	dto1.setNumOfMembers(4);
	System.out.println(dto1);
	
	System.out.println(dto.hashCode());
	System.out.println(dto1.hashCode());
	System.out.println(dto.equals(dto1));
	
	}

}
