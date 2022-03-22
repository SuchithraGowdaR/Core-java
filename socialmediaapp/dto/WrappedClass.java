package com.xworks.socialmediaapp.dto;

public class WrappedClass {
	public static void main(String[] args) {
		String phnNum="9742888513"; //Parsing
		System.out.println(phnNum);
		long cntNum=Long.parseLong(phnNum);
		System.out.println(cntNum);
		
		String age="120";
		System.out.println(age);
		byte huAge=Byte.parseByte(age);
		System.out.println(huAge);
		
		String loanAmount="31500";
		System.out.println(loanAmount);
		short lAmount=Short.parseShort(loanAmount);
		System.out.println(lAmount);
		
		String barCode="23516682";
		System.out.println(barCode);
		int barCodein=Integer.parseInt(barCode);
		System.out.println(barCodein);
		
		String price="455.250";
		System.out.println(price);
		float price1=Float.parseFloat(price);
		System.out.println(price1);
		
		String cgpa="7.694523665d";
		System.out.println(cgpa);
		double cgpa1=Double.parseDouble(cgpa);
		System.out.println(cgpa1);
		
		String hadBreakFast="True";
		System.out.println(hadBreakFast);
		boolean hadBreakFast1=Boolean.parseBoolean(hadBreakFast);
		System.out.println(hadBreakFast1);
		
		
		
	}

}
