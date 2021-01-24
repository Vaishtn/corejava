package com.xworkz.license.DTO;

import java.util.Date;
import com.xworkz.license.constant.BloodGroup;
import com.xworkz.license.constant.Gender;
import com.xworkz.license.DTO.AdressDTO;

public class CommonDTO {
	private String name;
	private AdressDTO address;
	private int age;
	private Date dob;
	private long mobileNo;
	private BloodGroup bloodGroup;
	private Gender gender;
	


	public CommonDTO() {
		super();
	}
	
	

	public CommonDTO(String name, AdressDTO address, int age, Date dob, long mobileNo, BloodGroup bloodGroup,Gender gender) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}
	
	



	@Override
	public String toString() {
		return "CommonDTO [name=" + name + ", address=" + address + ", age=" + age + ", dob=" + dob + ", mobileNo="
				+ mobileNo + ", bloodGroup=" + bloodGroup + ", gender=" + gender + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AdressDTO getAddress() {
		return address;
	}

	public void setAddress(AdressDTO address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	



}
