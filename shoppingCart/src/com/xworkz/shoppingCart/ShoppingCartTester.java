package com.xworkz.shoppingCart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoppingCartTester {

	public static void main(String[] args) {
		ShoppingCartDTO dto1=new ShoppingCartDTO();
		dto1.setItemName("shoe");
		dto1.setPrize(1500);
		dto1.setQuality(1);
		
		ShoppingCartDTO dto2=new ShoppingCartDTO();
		dto2.setItemName("top");
		dto2.setPrize(2000);
		dto2.setQuality(1);
		
		Collection<ShoppingCartDTO> cart=new ArrayList();
		cart.add(dto1);
		cart.add(dto2);
		
		ShoppingCartDTO dto3=new ShoppingCartDTO();
		dto3.setItemName("shoe");
		dto3.setPrize(1500);
		dto3.setQuality(1);
		
		System.out.println(dto3.getItemName());
		System.out.println(dto3.getPrize());
		System.out.println(dto3.getQuality());
		
	
		boolean Contain=cart.contains(dto3);
		System.out.println(Contain);
		if(Contain) {
			System.out.println("Already there");
			
		}else {
			System.out.println("added to the cart");
			cart.add(dto3);
		}
		System.out.println("after the cart");
		System.out.println(cart.size());
		
		
	}

}
