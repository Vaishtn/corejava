package com.xworkz.license.DAO;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.license.DTO.LicenseDTO;
import com.xworkz.license.constant.VechicalType;

public class LicenseDAOImpl implements LicenseDAO {

	private List<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo: " + idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updateVechicleTypeByIdProofNO(String idProof, VechicalType type) {
		System.out.println("invoked updateVechicalTypeByIdProofNo ");
		System.out.println("idproof:" + idProof);
		System.out.println("type:" + type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update,license is found");
			dtoFromDB.setVechicalType(type);
			return true;
		} else {
			System.out.println("cannot update,license not found");
		}
		return true;
	}

	@Override
	public boolean deleteByIdProofNo(String idPrrof) {
		LicenseDTO dto=this.findByIdProofNo(idPrrof);
		if(dto!=null) {
			System.out.println("found ,deleteing");
			this.database.remove(dto);
			System.out.println("deleted");
		}
		return true;
	}

}
