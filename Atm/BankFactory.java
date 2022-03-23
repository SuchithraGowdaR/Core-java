package com.xworks.oops.Abstraction.Atm;

public class BankFactory {
	public static AtmCardInf getDetails(String type) {
		 if(type.equalsIgnoreCase("Axis Bank")) {
			 AxisBankImpl bnk1=new  AxisBankImpl();
			 return bnk1;
		 }
		 else if(type.equalsIgnoreCase("Sbi Bank")) {
			 SbiBankImpl bnk2=new  SbiBankImpl();
			 return bnk2;
		 }
		 return null;
	}

}
