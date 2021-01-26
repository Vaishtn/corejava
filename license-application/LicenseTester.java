package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.xworkz.license.DAO.LicenseDAO;
import com.xworkz.license.DAO.LicenseDAOImpl;
import com.xworkz.license.DTO.AdressDTO;
import com.xworkz.license.DTO.CommonDTO;
import com.xworkz.license.DTO.LicenseDTO;
import com.xworkz.license.constant.BloodGroup;
import com.xworkz.license.constant.Gender;
import com.xworkz.license.constant.IdProof;
import com.xworkz.license.constant.VechicalType;

public class LicenseTester {
	public static void main(String[] args) {

		AdressDTO dto = new AdressDTO(35, "bhagyanagar", 583231, "koppal", "karnatak");
		System.out.println(dto);

		Date dob = new Date();// 16/10/1997
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob = format.parse("16/10/1997");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LicenseDTO licensedto = new LicenseDTO();
		licensedto.setCommercial(false);
		licensedto.setDisability(false);
		licensedto.setIdProof(IdProof.AADHAR);
		licensedto.setIdProofNo("555 666 222");
		licensedto.setStartDate(null);

		System.out.println(licensedto.isCommercial());
		System.out.println(licensedto.isDisability());
		System.out.println(licensedto.getIdProofNo());
		System.out.println(licensedto.getIdProof());
		System.out.println(licensedto.getStartDate());

		CommonDTO commondto = new CommonDTO("vai", dto, 22, null, 98562354l, BloodGroup.A_POSITIVE, Gender.FEMALE);
		System.out.println(commondto);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(licensedto);

		LicenseDTO dtoFound = dao.findByIdProofNo("555 666 222");
		System.out.println(dtoFound);

		boolean update = dao.updateVechicleTypeByIdProofNO("6363 8787 6449", VechicalType.LMV);
		System.out.println("updated" + update);
		
		boolean delete=dao.deleteByIdProofNo("555 632 458");
		System.out.println("deleted"+delete);
	}
}
