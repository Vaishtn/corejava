package com.xworkz.event.business;

import com.xworkz.event.exception.EmailLimitException;

public class EmailService {
	private int emailLimit=3;
	private String[] emails=new String[this.emailLimit];
	private int index=0;
	
	public EmailService() {
		System.out.println("create EmailService");
	}
	
	public void addEmail(String email) {
		System.out.println("invoked addEmail");
		System.out.println("arg1"+email);
		
		if(this.index<this.emails.length) {
			this.emails[this.index]=email;
			System.out.println("added email");
			this.index++;
			
		}else {
			throw new EmailLimitException("Max email limit reached.Limit is " +this.emailLimit);
			
		}
	}
	
	public void setEmailLimit(int emailLimit) {
		this.emailLimit=emailLimit;
	}
	
	public int getEmailLimit() {
		return emailLimit;
	}

}
