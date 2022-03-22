package com.xworks.socialmediaapp;

import com.xworks.socialmediaapp.dto.SocialMediaDTO;

public class SocialMediaUtil {
	
	public static void main(String []ar) {
		
		SocialMediaDTO dto=new SocialMediaDTO();
		
		 dto.setSocialMediaId(3);
		 dto.setAppName("Instgram");
		 dto.setFounder("Kevin Systrom");
		 dto.setSize(32);
		System.out.println( dto);
		
        SocialMediaDTO  dto1=new SocialMediaDTO();
        
        dto1.setSocialMediaId(3);
        dto1.setAppName("Microsoft Team");
        dto1.setFounder("Microsoft");
        dto1.setSize(30);
		System.out.println( dto1);
		
		System.out.println( dto1. hashCode());
		System.out.println( dto.equals( dto1));
		
	}

}