package com.xworkz.loginapp.watchman;
import com.xworkz.loginapp.loginexception.LoginException;

public class Watchman {
	
	public void security(int time) {
		if(time<=9) {
			System.out.println("U can go and do your work");
		}
		else if(time>9) {
			throw new LoginException();
		}
	}

}
