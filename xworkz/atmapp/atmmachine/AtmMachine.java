package com.xworkz.atmapp.atmmachine;

import com.xworkz.atmapp.exception.AtmException;

public class AtmMachine {
	
	public void withdraw(int amount)throws AtmException{
		if(amount<=25000) {
			System.out.println("Take cash and your card");
		}
		else if(amount>25000) {
			throw new AtmException();
			
		}
		
	}

}
