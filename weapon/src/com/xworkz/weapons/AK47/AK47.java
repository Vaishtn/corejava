package com.xworkz.weapons.AK47;

import com.xworkz.weapons.gunWeapon.MachineGunWeapon;

public class AK47 extends MachineGunWeapon {
	@Override
	public void trigger() {
		System.out.println("trigger");
		super.trigger();
	}
}
