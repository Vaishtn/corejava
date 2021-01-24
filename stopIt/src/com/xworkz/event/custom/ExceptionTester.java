package com.xworkz.event.custom;

public class ExceptionTester {
	public static void main(String[] args) {
		ExceptionThrower thrower=new ExceptionThrower();
		try {
			thrower.checked();
		}
		catch(CustomCheckedException custom ) {
			System.out.println(custom.getMessage());
		}
		thrower.unchecked();
	}

}
