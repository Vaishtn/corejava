package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HomogenousTester {

	public static void main(String[] args) {
		Object[] validages=new Object[4];
		validages[0]=21;
		validages[1]=18;
		validages[2]=new Thread();
		validages[3]="NOt";
		//generic---jdk1.8
		
		//loopAndChecktype(validages);
		
		for (int i = 0; i < validages.length; i++) {
			System.out.println(validages[i]);
			if(validages[i] instanceof String) {
				String values=(String)validages[i];
				System.out.println(values.toUpperCase());
				
			}
			
		}
		
		Collection<String> mobiles=new ArrayList();
		mobiles.add("Nokia");
		mobiles.add("Samsung");
		mobiles.add("Redmi");
		//mobiles.add(45);
		//mobiles.add(45.0);
		mobiles.add("Redmi");
		
		
		Iterator iterator=mobiles.iterator();
		int stringCount=0;
		while(iterator.hasNext()) {
			Object obj=iterator.hasNext();
			if(obj instanceof String) {
				System.out.println("string is found");
				stringCount++;
			}
		}
		System.out.println("total string count"+stringCount);
		
		
		
	}

}