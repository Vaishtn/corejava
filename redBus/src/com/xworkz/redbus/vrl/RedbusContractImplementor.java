package com.xworkz.redbus.vrl;

import com.xworkz.redbus.contract.RedbusContract;
import com.xworkz.redbus.contract.Security;

public class RedbusContractImplementor implements RedbusContract, Security {

	@Override
	public int minBooking() {
		System.out.println("invoked minBooking");
		return 20;
	}

	@Override
	public boolean busWarranty() {
		System.out.println("invoked busWarranty");
		return true;
	}
	
	public void close() {
		System.out.println("invoked close method");
	}

	@Override
	public void open() {
		System.out.println("invoked open method");
		
	}
		

}