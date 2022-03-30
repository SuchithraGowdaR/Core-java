package com.xworkz.pubapp.bouncer;

import com.xworkz.pubapp.exception.PubException;

public class Bouncer {
	
	public void check(int age) throws PubException {
		if(age>=18) {
			System.out.println("Check in and Enjoyy.........");
		}
		else if(age<18) {
			throw new PubException();
		}
	}

}
