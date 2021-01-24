package com.xworkz.employee;

public class Teacher implements Employee,Programmer{

	@Override
	public void programming() {
		System.out.println("Java Programming");
		
	}

	@Override
	public void payment() {
	System.out.println("Employee payment");
		
	}

}
