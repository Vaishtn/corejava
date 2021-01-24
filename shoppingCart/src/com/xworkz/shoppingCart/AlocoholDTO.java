package com.xworkz.shoppingCart;

public class AlocoholDTO {
	private String name;
	private String nameOfBrand;
	private int spiritpercentage;
	
	public AlocoholDTO() {
		
	}

	public AlocoholDTO(String name, String nameOfBrand, int spiritpercentage) {
		super();
		this.name = name;
		this.nameOfBrand = nameOfBrand;
		this.spiritpercentage = spiritpercentage;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
			}
		if(obj instanceof AlocoholDTO) {
			AlocoholDTO cast=(AlocoholDTO)obj;
			if(this.nameOfBrand.equals(cast.nameOfBrand) && this.name.equals(cast.name)) {
				System.out.println("Alocohol:"+cast);
			}
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "AlocoholDTO [name=" + name + ", nameOfBrand=" + nameOfBrand + ", spiritpercentage=" + spiritpercentage
				+ "]";
	}

	public String getName() {
		return name;
	}

	public String getNameOfBrand() {
		return nameOfBrand;
	}

	public int getSpiritpercentage() {
		return spiritpercentage;
	}

		

}
