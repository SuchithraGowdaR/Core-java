package com.xworkz.loginapp;

import java.util.Scanner;

import com.xworkz.loginapp.loginexception.LoginException;
import com.xworkz.loginapp.watchman.Watchman;

public class LoginTester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time");
		int time=sc.nextInt();
		
		Watchman wman=new Watchman();
		try {
		wman.security(time);
		}
		catch(LoginException le) {
			le.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}

}
