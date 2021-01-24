package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class FoodItems {

	public static void main(String[] args) {
		String breakFast="Dosa";
		String southIndian="Paddu";
		String northIndian="roti";
		String dinner="rice";
		
		Collection foods=new ArrayList();
		boolean added=false;
		added=foods.add(dinner);
		System.out.println(added);
		added=foods.add(breakFast);
		System.out.println(added);
		added=foods.add(foods);
		System.out.println(added);
		added=foods.add(northIndian);
		System.out.println(added);
		added=foods.add(southIndian);
		System.out.println(added);
		
		
		
		int totalElements=foods.size();
		System.out.println("totalElement:"+totalElements);
		
		boolean contains=foods.contains(foods);
		System.out.println("Food contain :"+contains);
	}

}
