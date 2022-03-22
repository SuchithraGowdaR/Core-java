package com.xworks.socialmediaapp;

import com.xworks.socialmediaapp.dto.CourtCaseDTO;

public class CourtCaseUtil {
	public static void main(String []ar) {
		
	CourtCaseDTO dto=new CourtCaseDTO();
	dto.setSectionNum(420);
	dto.setCaseNum(03);
	dto.setTypeOfCase("Picpocket");
	
	System.out.println(dto);
	System.out.println(dto.hashCode());
	
	CourtCaseDTO dto1=new CourtCaseDTO();
	dto1.setSectionNum(312);
	dto1.setCaseNum(11);
	dto1.setTypeOfCase("Pickpocket");
	
	System.out.println(dto1);
	System.out.println(dto1.hashCode());
	System.out.println(dto1.equals(dto));
}
}
