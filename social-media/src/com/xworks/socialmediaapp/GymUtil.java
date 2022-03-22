package com.xworks.socialmediaapp;
import com.xworks.socialmediaapp.dto.GymDTO;

public class GymUtil {
	public static void main(String[] args) {
		GymDTO dto=new GymDTO();
		dto.setStartTime("6am");
		dto.setEndTime("7:30pm");
		dto.setNumOfInstruments(12);
		dto.setTrainerName("Nikunj");
		System.out.println(dto);
		
		
		GymDTO dto1=dto;
		dto1.setStartTime("8am");
		dto1.setEndTime("9:30pm");
		dto1.setNumOfInstruments(2);
	
		System.out.println(dto1);
		
		System.out.println(dto1.hashCode());
		System.out.println(dto1.equals(dto));
	}

}
