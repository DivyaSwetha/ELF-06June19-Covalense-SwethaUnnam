package com.covalense.assignmentssecond;

public class TestFuel {

	public static void main(String[] args) {
		Level l1 = new Level1();
		Level l2 = new Level2();
		Level l3 = new Level3();

		FuelLevel f = new FuelLevel();
		f.amount(l2);
	}

}
