package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

public class CollectionTester {

	public static void main(String[] args) {
		
		
		String cadbury="Milky Bar";
		String nestle="kit kat";
		String parle="kiss me";
		String amul="Dark Chocolate";
		
		Collection chocolates=new ArrayList();
		boolean added=false;
		added=chocolates.add(cadbury);
		System.out.println(added);
		added=chocolates.add(parle);
		System.out.println(added);
		added=chocolates.add(nestle);
		System.out.println(added);
		added=chocolates.add(amul);
		System.out.println(added);
		
		int totalElements=chocolates.size();
		System.out.println("totalElement:"+totalElements);
		
		String hersheys="hersheys kiss";
		boolean removed=chocolates.remove(null);
		System.out.println("Removed:"+removed);
		String ref=null;
		if(ref!=null) {
			System.out.println(ref.toString());
			//return true;
		}
		added=chocolates.add(null);
		System.out.println("added null:"+added);
		added=chocolates.add(null);
		System.out.println("added null:"+added);
		//else return false;
		totalElements=chocolates.size();
		System.out.println("totalElements:"+totalElements);
		
		//List chocolateList=new ArrayList();
		
		System.out.println("looping chocolates");
		
		
		Object[] convertedChocolates=chocolates.toArray();
		for (int i = 0; i < convertedChocolates.length; i++) {
			System.out.println(convertedChocolates[i]);
			
		}
		
		System.out.println("looping using iterator***************");
		
		Iterator iterator=chocolates.iterator();
		//hashNext(),next();remove();
		
		while(iterator.hasNext()) {
			System.out.println("element present");
			Object str=iterator.next();
			System.out.println(str);
		}
		
		boolean contains=chocolates.contains(amul);
		System.out.println("contain : "+contains);
		
		boolean isEmpty=chocolates.isEmpty();
		System.out.println("empty "+ isEmpty);
		
		
		
		
		
		
		
		int total=chocolates.size();
		System.out.println("total number of chocolates "+total);
		System.out.println(chocolates);
	}

}
