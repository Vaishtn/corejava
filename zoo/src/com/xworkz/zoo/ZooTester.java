package com.xworkz.zoo;

import com.xworkz.zoo.dto.ZooDTO;

public class ZooTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ZooDTO zoodto=new ZooDTO();
		zoodto.setEntryFees(100);
		zoodto.setLocation("mysore");
		zoodto.setSafari(true);
		
		System.out.println(zoodto.getEntryFees());
		System.out.println(zoodto.getLocation());
		System.out.println(zoodto.isSafari());
		
		ZooDTO zoo1=zoodto.clone();
		System.out.println(zoo1.getEntryFees());
		System.out.println(zoo1.getLocation());
		System.out.println(zoo1.isSafari());
	}

}
