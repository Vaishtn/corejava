package com.xworkz.palace.dto;

import com.xworkz.palace.dto.PalaceDTO;


public class PalaceDTO implements Cloneable {
	private String location;
	private String kingName;
	private String queenName;
	
	public PalaceDTO() {
		System.out.println("enter to palace");
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getKingName() {
		return kingName;
	}
	public void setKingName(String kingName) {
		this.kingName = kingName;
	}
	public String getQueenName() {
		return queenName;
	}
	public void setQueenName(String queenName) {
		this.queenName = queenName;
	}
	
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode");
		return 236;
	}

	@Override
	public String toString() {
		return "PalaceDTO [location=" + location + ", kingName=" + kingName + ", queenName=" + queenName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
			if(this==obj) {
				return true;
				
			}
		if(obj instanceof PalaceDTO) {
			PalaceDTO palace=(PalaceDTO)obj;
			if(palace.getKingName()==this.kingName) {
				return true;
				
			}
			return false;
		}
		return false;
	
	
	}
	@Override
	public PalaceDTO clone() throws CloneNotSupportedException {
		PalaceDTO dto=new PalaceDTO();
		this.kingName=dto.getKingName();
		this.location=dto.getLocation();
		return(PalaceDTO) super.clone();

	
	

	}
}

