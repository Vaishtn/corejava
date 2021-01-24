package com.xworkz.Application;

import java.util.Scanner;

import com.xworkz.Hospital.Hospital;

public class HospitalApplication {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		Scanner scanner=new Scanner(System.in);
		
		hospital.setName("MVK");
		hospital.setNoOfDoctor(10);
		hospital.setAddress("koppal");
		hospital.setGst(700);
		hospital.setPhoneNo(78956212);
		hospital.setTypeOfHospital("Physiotherapy");
		
		while(true) {
			
				
			
			System.out.println("Welcome to " +hospital.getName());
			System.out.println("1.AddPatient");
			System.out.println("2.DisplayPatient");
			System.out.println("3.DeletePatient");
			System.out.println("4.UpdatePatient");
			System.out.println("5.Exit");
			System.out.println("Please Enter Option");
			int operation=scanner.nextInt();
			if (operation==1) {
				hospital.addPatient();
				}
			if(operation==2) {
				hospital.displayPatientDetails();
			}
			if (operation==3) {
				hospital.deletePatientDetail(1);
			}
			}
			
		}
		
	
	}


