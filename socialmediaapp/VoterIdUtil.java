package com.xworks.socialmediaapp;

import com.xworks.socialmediaapp.dto.VoterIdDTO;

public class VoterIdUtil {
	public static void main(String []ar) {
		
	VoterIdDTO dto=new 	VoterIdDTO();
	dto.setIdNum(200);
	dto.setName("Arya");
	dto.setDob("25/06/1999");
	dto.setGender("Female");
	System.out.println(dto);
	System.out.println(dto.hashCode());
	
	VoterIdDTO dto1=new VoterIdDTO();
	dto1.setIdNum(215);
	dto1.setName("Gowda");
	dto1.setDob("25/06/1999");
	dto1.setGender("Female");
	
	System.out.println(dto1.hashCode());
	System.out.println(dto1.equals(dto));
	}
}
