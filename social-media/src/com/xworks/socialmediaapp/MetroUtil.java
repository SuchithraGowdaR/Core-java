package com.xworks.socialmediaapp;

import com.xworks.socialmediaapp.dto.MetroDTO;

public class MetroUtil {
	public static void main(String []ar) {
		MetroDTO dto= new MetroDTO();
		dto.setStartPoint("Nayandalli");
		dto.setEndPoint("magestic");
		dto.setMetroNum(0526);
		dto.setPlatFormNum(2);
		System.out.println(dto);
		System.out.println(dto.hashCode());
		
		MetroDTO dto1= new MetroDTO();
		dto1.setStartPoint("Nayandalli");
		dto1.setEndPoint("Vijayanagara");
		dto1.setMetroNum(0265);
		dto1.setPlatFormNum(3);
		System.out.println(dto1);
		System.out.println(dto1.hashCode());
		System.out.println(dto1.equals(dto));
	}

}
