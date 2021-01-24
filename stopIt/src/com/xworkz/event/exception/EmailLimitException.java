package com.xworkz.event.exception;

public class EmailLimitException extends RuntimeException{
	public EmailLimitException() {
		
	}
	
	public EmailLimitException(String message) {
		super(message);
		
	}

}
