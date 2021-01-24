package com.xworkz.Hospital;

import java.util.Scanner;

import com.xworkz.patientmodule.Patient;

public class Hospital {
	String name;
	String location;
	int gst;
	long phoneNo;
	String typeOfHospital;
	int noOfDoctor;
	
	Scanner scanner=new Scanner(System.in);
	Patient patientDetails[]=new Patient[20];
	int patientCount=0;
	
	
	public void addPatient() {
		Patient patient=new Patient();
	
		
		
		System.out.println("Please Enter Name of Patient");
		String name=scanner.next();
		patient.setName(name);
		
		System.out.println("Enter patient age");
		int age=scanner.nextInt();
		patient.setAge(age);
		
		System.out.println("Enter patient Address");
		String Address=scanner.next();
		patient.setAddress(Address);
		
		System.out.println("Enter patient Phoneno");
		long phneNo=scanner.nextLong();
		patient.setPhoneNo(phneNo);
		
		System.out.println("Enter patientId");
		int patientId=scanner.nextInt();
		patient.setPatientId(patientId);
		
		
		 patientDetails[patientCount]=patient;
		  patientCount=patientCount+1;
		
		
	}
	
	public void displayPatientDetails() {
		for (int i = 0; i < patientCount; i++) {
			if (patientDetails[i]!=null )
			{
			
		
			System.out.println("patient Name "+patientDetails[i].getName());
			System.out.println("patient Age "+patientDetails[i].getAge());
			System.out.println("patient addresss "+patientDetails[i].getAddress());
			System.out.println("patient phoneno "+patientDetails[i].getPhoneNo());
			System.out.println("patientId "+patientDetails[i].getPatientId());
			
		}
		}
	}
	
	public void deletePatientDetail(int index) {
		for (int i = 0; i < patientCount; i++) {
			if (i==index) {
				
			
			patientDetails[i]=null ;
				
				
			
				}
		}
		}
	
	
	
	
	
	public int getNoOfDoctor() {
		return noOfDoctor;
	}
	public void setNoOfDoctor(int noOfDoctor) {
		this.noOfDoctor = noOfDoctor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlocation() {
		return location;
	}
	public void setAddress(String location) {
		this.location = location;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getTypeOfHospital() {
		return typeOfHospital;
	}
	public void setTypeOfHospital(String typeOfHospital) {
		this.typeOfHospital = typeOfHospital;
	}
	

}
