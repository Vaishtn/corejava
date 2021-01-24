package com.xworkz.license.DAO;

import com.xworkz.license.DTO.LicenseDTO;


public class LicenseDAOImpl implements LicenseDAO {

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoke " +dto);	
	}

}
