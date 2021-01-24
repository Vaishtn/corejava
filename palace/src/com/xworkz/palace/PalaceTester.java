package com.xworkz.palace;

import com.xworkz.palace.dto.PalaceDTO;

public class PalaceTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		PalaceDTO palacedto=new PalaceDTO();
		palacedto.setKingName("Mv");
		palacedto.setLocation("Mysore");
		palacedto.setQueenName("MV");
		
		System.out.println(palacedto.getKingName());
		System.out.println(palacedto.getLocation());
		System.out.println(palacedto.getQueenName());
		
		PalaceDTO palace=palacedto.clone();
		System.out.println(palace.getKingName());
		System.out.println(palace.getLocation());
		System.out.println(palace.getLocation());
		
	}

}
