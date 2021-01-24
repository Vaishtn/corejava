package com.xworkz.redbus;

import com.xworkz.redbus.dto.PhoneBookDTO;
import com.xworkz.redbus.dto.MobilePhoneBookDTO;


public class CloneTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		PhoneBookDTO bookDTO = new PhoneBookDTO();
		bookDTO.setName("Veeresh");
		bookDTO.setPincode("583228");
		bookDTO.setPhoneNo(7760727960l);

		PhoneBookDTO copyOfPhoneBook = bookDTO.clone();
		System.out.println(
				copyOfPhoneBook.getName() + " " + copyOfPhoneBook.getPhoneNo() + " " + copyOfPhoneBook.getPincode());
		Object object = (Object) bookDTO;

		// MobilePhoneBookDTO child=(MobilePhoneBookDTO)bookDTO;

		Object name = "X-workz";

		PhoneBookDTO dto = (PhoneBookDTO) name;
	}


}
