package com.xworkz.weapons.brahmosWeapon;

public class MissleBrahmosWeapon implements BrahmosWeapon {
	private int noOfBullets;

	
	public void setNoOfBullets(int noOfBullets) {
		this.noOfBullets = noOfBullets;
	}

	@Override
	public void damage() {
		System.out.println("invoked damage");

	}

	@Override
	public void abort() {
		System.out.println("invoked abort");

	}

	@Override
	public void dontknow() {
		System.out.println("invoked dontknow");

	}

	@Override
	public String toString() {
		
		return "MissleBrahmosWeapon [noOfBullets=" + noOfBullets + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode");
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
