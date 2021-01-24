package com.xworkz.zoo.dto;

public class ZooDTO implements Cloneable{
	private String name;
	private int noOfAnimals;
	private String location;
	private int entryFees;
	private boolean safari;
	
	public ZooDTO() {
		System.out.println("Zoo constructor is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

	public boolean isSafari() {
		return safari;
	}

	public void setSafari(boolean safari) {
		this.safari = safari;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return 253;
	}

	@Override
	public String toString() {
		return "ZooDTO [name=" + name + ", noOfAnimals=" + noOfAnimals + ", location=" + location + ", entryFees="
				+ entryFees + ", safari=" + safari + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
			if(this==obj) {
				return true;
				
			}
		if(obj instanceof ZooDTO) {
			ZooDTO zoo=(ZooDTO)obj;
			if(zoo.getName()==this.name) {
				return true;
				
			}
			return false;
		}
		return false;
	}
	@Override
	public ZooDTO clone() throws CloneNotSupportedException {
		ZooDTO dto=new ZooDTO();
		this.entryFees=dto.getEntryFees();
		this.safari=dto.isSafari();
		return(ZooDTO) super.clone();
	}
	
}
