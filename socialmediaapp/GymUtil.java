package com.xworks.socialmediaapp;
import java.util.Scanner;

import com.xworks.socialmediaapp.dto.GymDTO;

public class GymUtil {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
			System.out.println("Enter Start time");
			String stm=scn.next();
			System.out.println("Enter end time");
			String etm=scn.next();
			System.out.println("Enter Number of instruments");
			int nuins=scn.nextInt();
			System.out.println("Enter trainer name");
			String trname=scn.next();
		
		
		GymDTO dto=new GymDTO();
		dto.setStartTime(stm);
		dto.setEndTime(etm);
		dto.setNumOfInstruments(nuins);
		dto.setTrainerName(trname);
		
			System.out.println(dto);
		
		
		GymDTO dto1=dto ;
		dto1.setStartTime("8am");
		dto1.setEndTime("9:30pm");
		dto1.setNumOfInstruments(2);
	
			System.out.println(dto1);
		
			System.out.println(dto1.hashCode());
			System.out.println(dto1.equals(dto));
	}

}
