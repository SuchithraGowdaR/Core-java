package com.xworks.oops.Abstraction.Atm;

public class BankTester {
	public static void main(String[] args) {
		
		AtmCardInf atm= new AxisBankImpl();
		atm.cardSwipe();
		
		AtmCardInf atm0=new SbiBankImpl();
		atm0.cardSwipe();
	}

}
