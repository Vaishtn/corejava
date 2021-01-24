package com.xworkz.weapons.gunWeapon;

public class MachineGunWeapon implements GunWeapon {
	private int range;

	@Override
	public void damage() {
		System.out.println("invoked damage");
	}

	@Override
	public void abort() {
		System.out.println("invoked abort");
	}

	@Override
	public void trigger() {
		System.out.println("invoked trigger");
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode");
		return 56;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			
		}
		return super.equals(obj);
	}
}
