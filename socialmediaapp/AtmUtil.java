package com.xworks.socialmediaapp;

import java.util.Scanner;

import com.xworks.socialmediaapp.dto.AtmDTO;



public class AtmUtil {
	public static void main(String []ar) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter card type");
		String typeOfCard= sc.next();
		System.out.println("enter card limitation");
		int limitation= sc.nextInt();
		System.out.println("enter card card num");
		int cardNum= sc.nextInt();


		
		AtmDTO dto=new AtmDTO();
		dto.setTypeOfCard(typeOfCard);
		dto.setLimitation(limitation);
		dto.setCardNum(cardNum);
		System.out.println(dto);
		System.out.println(dto.hashCode());
		
		AtmDTO dto1=new AtmDTO();
		dto1.setTypeOfCard("Debit");
		dto1.setLimitation(20000);
		dto1.setCardNum(1256);
		System.out.println(dto1);
		System.out.println(dto1.hashCode());
		System.out.println(dto1.equals(dto));
		
		
		
	}
}
