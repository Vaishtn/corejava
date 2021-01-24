package com.xworkz.solution;

import java.util.ArrayList;

import java.util.Collection;

public class MobileNumber {

	public static void main(String[] args) {
		
		
		Collection<Long> mobileNumbers=new ArrayList();
		mobileNumbers.add(9538963566l);
		mobileNumbers.add(8296814208l);
		
		for(Long mobileNo:mobileNumbers) {
			String convertedMobileNo=mobileNo.toString();
			Character last=convertedMobileNo.charAt(convertedMobileNo.length()-1);
			System.out.println(last);
			if(Integer.parseInt(last.toString())>3) {
				System.out.println("mobile number is greater"+ convertedMobileNo);
			}
			
		}
		


		
	}

}
