//standerd packege
package com.xworkz.pubapp;

import java.util.Scanner;

import com.xworkz.pubapp.bouncer.Bouncer;
import com.xworkz.pubapp.exception.PubException;

public class PubTester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		Bouncer bouncer=new Bouncer();
		try {
		bouncer.check(age);
		}catch(PubException pe) {
			pe.printStackTrace();
		}
		finally {
			if (sc != null);
			sc.close();
		}
	}

}
