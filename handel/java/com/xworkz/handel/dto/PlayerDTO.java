package com.xworkz.handel.dto;

public class PlayerDTO {
	public String name;
	 public String sport;
	public int jerstNo;
	
	public PlayerDTO() {
		System.out.println("invoked playerdto");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getJerstNo() {
		return jerstNo;
	}

	public void setJerstNo(int jerstNo) {
		this.jerstNo = jerstNo;
	}
	

}
