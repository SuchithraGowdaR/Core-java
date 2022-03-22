package com.xworks.socialmediaapp;
import com.xworks.socialmediaapp.dto.RailwayStationDTO;


public class RailwayStationUtil {
	public static void main(String [] ar) {
		RailwayStationDTO dto=new RailwayStationDTO();
		dto.setAdress("Ramanagara");
		dto.setPlatform(6);
		dto.setPinCode(128);
		System.out.println(dto);
		System.out.println(dto.hashCode());

		RailwayStationDTO dto1=new RailwayStationDTO();
		dto1.setAdress("mejestic Bangalore");
		dto1.setPlatform(5);
		dto1.setPinCode(115);
		System.out.println(dto1);
		System.out.println(dto1.hashCode());
		
		System.out.println(dto.equals(dto1));

	}
	}
