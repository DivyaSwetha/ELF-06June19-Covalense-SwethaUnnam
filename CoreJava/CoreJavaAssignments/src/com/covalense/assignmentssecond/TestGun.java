package com.covalense.assignmentssecond;

public class TestGun {

	public static void main(String[] args) {
		BeforeShoot r1 = new Round1();
		BeforeShoot r2 = new Round2();

		BeforeShoot r3 = new Round3();

		Gun g = new Gun();
		g.count(r1);

	}

}
