package com.xworks.socialmediaapp;

import com.xworks.socialmediaapp.dto.HospitalDTO;

public class HospitalUtil {
	public static void main(String[] ar) {
		HospitalDTO dto=new HospitalDTO();
		dto.setName("RR Hospital");
		dto.setAdress("kengeri, Banglore Mysore road ");
		dto.setNumOfWards(215);
		System.out.println(dto);
		System.out.println(dto.hashCode());
		
		HospitalDTO dto1=new HospitalDTO();
		dto1.setName("RR Hospital");
		dto1.setAdress("banglore, Mysore road ");
		dto1.setNumOfWards(200);
		System.out.println(dto1);
		System.out.println(dto1.hashCode());
		System.out.println(dto1.equals(dto));
	}

}
