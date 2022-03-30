package com.xworkz.atmapp.exception;

// custom checked Exception
public class AtmException extends Exception{
	
	public AtmException() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
	}
	
		@Override
		public String toString() {
			return " u can not withdraw this amount try to withdraw the amount less than your card limitation " ;
			
		}
	

}
