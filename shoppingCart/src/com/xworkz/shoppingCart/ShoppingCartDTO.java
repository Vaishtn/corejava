package com.xworkz.shoppingCart;

public class ShoppingCartDTO {
	private int prize;
	private String itemName;
	private int quality;
	
	public void  ShoppingCartDTO() {
		
	}

	@Override
	public String toString() {
		return "ShoppingCart [prize=" + prize + ", itemName=" + itemName + ", quality=" + quality + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj instanceof ShoppingCartDTO ) {
			ShoppingCartDTO cast=(ShoppingCartDTO)obj;
			if(this.itemName.equals(cast.getItemName()) && this.prize==cast.getPrize()) {
				System.out.println("shopping"+cast);
				return true;
			}
		}
		return false;
		}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}
	

	
}
