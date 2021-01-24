package com.xworkz.shoppingCart;

import java.util.List;
import java.util.ArrayList;


public class AlocoholTester {

	public static void main(String[] args) {
		AlocoholDTO dto1=new AlocoholDTO("IB", "Imperial", 48);
		AlocoholDTO dto2=new AlocoholDTO("Amstel", "King Fisher",4);
		AlocoholDTO dto3=new AlocoholDTO("Magic Moments", "NA", 38);
		AlocoholDTO dto4=new AlocoholDTO("Old Monk", "NA", 42);

		List<AlocoholDTO> drinks=new ArrayList<AlocoholDTO>(100);
		drinks.add(dto1);
		drinks.add(1,dto2);
		drinks.add(dto3);
		drinks.add(dto4);
		
//		drinks.remove(dto2);
//		drinks.remove(2);
		
		AlocoholDTO dto5=new AlocoholDTO("Bud Wiser", "King Fisher", 8);
		//AlocoholDTO dto6=new Alocoho
		
		drinks.add(3, dto5);
		
		int index=drinks.indexOf(dto5);
		System.out.println("indexOf" +index);
		
		int lastindex=drinks.lastIndexOf(dto4);
		System.out.println("lastIndex"+lastindex);
		for (AlocoholDTO alocoholDTO : drinks) {
			System.out.println(alocoholDTO);
			
		}

		
		
	}

}
