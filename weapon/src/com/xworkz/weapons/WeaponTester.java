package com.xworkz.weapons;

import com.xworkz.weapons.AK47.AK47;
import com.xworkz.weapons.brahmosWeapon.MissleBrahmosWeapon;

public class WeaponTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		MissleBrahmosWeapon weapon = new MissleBrahmosWeapon();
		weapon.abort();
		weapon.setNoOfBullets(6);
		int hash=weapon.hashCode();
		System.out.println(hash);
		weapon.dontknow();
		String str=weapon.toString();
		System.out.println(str);
		System.out.println(weapon.COUNTRYNAME);
		System.out.println("***********************");

		AK47 ak47 = new AK47();
		ak47.abort();
		ak47.damage();
		
	}

}
