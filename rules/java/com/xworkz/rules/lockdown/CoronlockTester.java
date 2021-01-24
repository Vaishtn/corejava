package com.xworkz.rules.lockdown;

import com.xworkz.rules.lockdown.coron.CoronLockDownImplementation;
import com.xworkz.rules.lockdown.coron.CoronLockDown;

public class CoronlockTester {

	public static void main(String[] args) {
		CoronLockDownImplementation implementation=new CoronLockDownImplementation();
		implementation.socialDistance();
		implementation.sanitizer();
		implementation.wearMask();
		
	}

}
