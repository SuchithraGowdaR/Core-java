package com.xworkz.atmapp;

import com.xworkz.atmapp.atmmachine.AtmMachine;
import com.xworkz.atmapp.exception.AtmException;
import java.util.Scanner;

public class AtmTester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount=sc.nextInt();
		
		AtmMachine machine= new AtmMachine();
		try {
		machine.withdraw(amount);
		}catch(AtmException ae) {
			ae.printStackTrace();
		}
		finally {
			if(sc !=null);
			sc.close();
		}
		System.out.println("Thank you for using this ATM");
	}
	

}
