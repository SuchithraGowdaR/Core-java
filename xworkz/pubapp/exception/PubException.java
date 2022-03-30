package com.xworkz.pubapp.exception;

//custom cheked Exception
public class PubException extends Exception{
	
	public PubException() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	@Override
	public String toString() {
		//TODO Auto-generated method stub
		return "Boss/madam u cant enter to pub bcz ur too young , go back to your home and study";
	}

}
