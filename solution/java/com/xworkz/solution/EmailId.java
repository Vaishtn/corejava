package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmailId {

	public static void main(String[] args) {
		Collection<String> emailIds=new ArrayList();
		
		emailIds.add("vaishnavi@gmail.com");
		emailIds.add("Varsha@gmail.com");
		emailIds.add("vaishnavi@gmail.com");
		
		Collection<String> tempemailIds=new ArrayList<String>();
		Iterator<String> iterator=emailIds.iterator();
		while(iterator.hasNext()) {
			String emailId=iterator.next();
			System.out.println("Email Id:"+emailId);
			if(tempemailIds.contains(emailId)) {
				System.out.println("duplicate email Id:"+emailId);
				
			}else {
				System.out.println("added"+emailId);
				tempemailIds.add(emailId);
			}
		}
		
		System.out.println("tempemailIds size"+tempemailIds.size());
		
		emailIds.clear();
		//for each
		Iterator<String> tempIterator=tempemailIds.iterator();
		while(tempIterator.hasNext()) {
			emailIds.add(tempIterator.next());
		}
		System.out.println("size of email ids"+emailIds.size());
		
		
	}

}
