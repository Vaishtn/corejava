package com.xworkz.license.DTO;

import java.util.Date;
import com.xworkz.license.DTO.CommonDTO;
import com.xworkz.license.constant.IdProof;


import com.xworkz.license.constant.IdProof;

public class LicenseDTO extends CommonDTO{
	private IdProof idProof;
	private int idProofNo;
	private Date startDate;
	private boolean disability;
	private boolean commercial;
	
	public LicenseDTO() {
		
	}

	public IdProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	
	public int getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(int idProofNo) {
		this.idProofNo = idProofNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

}
