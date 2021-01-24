package com.xworkz.redbus;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.contract.Security;
import com.xworkz.redbus.contract.RedbusContract;
import com.xworkz.redbus.vrl.RedbusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {
		
		Security security=new RedbusContractImplementor();
		security.open();

		
		RedbusContract contract=new RedbusContractImplementor();
		contract.minBooking();
		
		
		
		RedbusContractImplementor impl=new RedbusContractImplementor();
		impl.close();
		impl.busWarranty();
		impl.minBooking();
		
		Object obj=new RedbusContractImplementor();
		obj.hashCode();
		
		
				
		TravelAgency agency=new TravelAgency(contract);
		
		agency.acceptBooking();
		
	}
}
