package com.xworkz.event.business;

import com.xworkz.event.exception.EmailValidationException;

public class Display {
	public void printEmail(String email) throws EmailValidationException{
		if(email!=null) {
			if(email.contains("@")&&(email.contains(".com")||email.contains(".in"))) {
				System.out.println("valid email");
				System.out.println(email);
			}else {
				throw new EmailValidationException("email should contain @ and .com or .in ");
			}
		}
	}
}
