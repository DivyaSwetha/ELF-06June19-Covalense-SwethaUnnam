package com.covalense.javaapp.passingobjecttomethod;

public class TestBaby {

	public static void main(String[] args) {
		Baby b = new Baby();
		Lays l = new Lays();
		Kurkure k = new Kurkure();
		b.eat(l);
		b.eat(k);
	}

}
