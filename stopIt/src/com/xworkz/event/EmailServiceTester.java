package com.xworkz.event;

import com.xworkz.event.business.EmailService;

public class EmailServiceTester {
	
	public static void main(String[] args) {
		EmailService service=new EmailService();
		//service.setEmailLimit(100);
		service.addEmail("contact@x-workz.in");
		service.addEmail("vaishu.xworkz@gmail.com");
		service.addEmail("sahan.xworkz@gmail.com");
		service.addEmail("om.bn@outlook.com");
	}

}
