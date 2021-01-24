package com.xworkz.license.DTO;
import java.security.PublicKey;


public class AdressDTO {
	private int houseNo;
	private String streetName;
	private int pincode;
	private String city;
	private String state;
	
	public AdressDTO() {
		
	}
	
	
	

	public AdressDTO(int houseNo, String streetName, int pincode, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}




	@Override
	public String toString() {
		return "AdressDTO [houseNo=" + houseNo + ", streetName=" + streetName + ", pincode=" + pincode + ", city="
				+ city + ", state=" + state + "]";
	}


	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
