package com.xworkz.license;

import java.util.Date;
import com.xworkz.license.DAO.LicenseDAO;
import com.xworkz.license.DAO.LicenseDAOImpl;
import com.xworkz.license.DTO.AdressDTO;
import com.xworkz.license.DTO.CommonDTO;
import com.xworkz.license.DTO.LicenseDTO;
import com.xworkz.license.constant.BloodGroup;
import com.xworkz.license.constant.Gender;
import com.xworkz.license.constant.IdProof;

public class LicenseTester {
public static void main(String[] args) {
	AdressDTO dto=new AdressDTO(35,"bhagyanagar",583231,"koppal","karnatak");
	System.out.println(dto);
	
	
	LicenseDTO licensedto=new LicenseDTO();
	licensedto.setCommercial(false);
	licensedto.setDisability(false);
	licensedto.setIdProof(IdProof.AADHAR);
	licensedto.setIdProofNo(456625365);
	licensedto.setStartDate(null);
	
	System.out.println(licensedto.isCommercial());
	System.out.println(licensedto.isDisability());
	System.out.println(licensedto.getIdProofNo());
	System.out.println(licensedto.getIdProof());
	System.out.println(licensedto.getStartDate());
	
	CommonDTO commondto=new CommonDTO("vai",dto,22,null,98562354l,BloodGroup.A_POSITIVE,Gender.FEMALE);
	System.out.println(commondto);
	
	
	LicenseDAO dao=new LicenseDAOImpl();
	dao.save(licensedto);
}
}
