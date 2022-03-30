package com.xworkz.loginapp.loginexception;

//custom unchecked exception
public class LoginException extends RuntimeException {
	
	public LoginException() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	@Override
	public String toString() {
		return "You are too late i can not allow u to inside the office";
	}

}
