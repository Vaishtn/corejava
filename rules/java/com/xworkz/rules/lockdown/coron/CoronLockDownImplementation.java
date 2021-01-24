package com.xworkz.rules.lockdown.coron;

public class CoronLockDownImplementation implements CoronLockDown{

	@Override
	public void socialDistance() {
       System.out.println("invoked social distance");		
	}

	@Override
	public String sanitizer() {
		System.out.println("sanitizer used is");
		return "Dettol";
	}

	@Override
	public void wearMask() {
		System.out.println("wear mask");		
	}
	
	
}
