package com.covalense.assignmentssecond;

public class TestIce {

	public static void main(String[] args) {
		IceCream ice = new IceCream();
		Vanilla v = new Vanilla();
		ChocoBix c = new ChocoBix();
		Baby b = new Baby();
		b.recieve(v);
	}

}
