package com.xworkz.celebration.dto;

public class FreedomFighterDTO {
	private String name;
	private String birthPlace;
	private Gender gender;
	
	public enum Gender{
		MALE,FEMALE
	}

	public FreedomFighterDTO(String name, String birthPlace, Gender gender) {
		super();
		this.name = name;
		this.birthPlace = birthPlace;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "FreedomFighterDTO [name=" + name + ", birthPlace=" + birthPlace + ", gender=" + gender + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 7777;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
			if(obj instanceof FreedomFighterDTO) {
				FreedomFighterDTO casted=(FreedomFighterDTO)obj;
				if(casted.getName()!=null && casted.getName().equals(this.getName())) {
					return true;
				}
			}
		
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	

}
