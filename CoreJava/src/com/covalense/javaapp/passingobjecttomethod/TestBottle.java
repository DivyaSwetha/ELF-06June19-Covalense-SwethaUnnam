package com.covalense.javaapp.passingobjecttomethod;

public class TestBottle {

	public static void main(String[] args) {
		Drinker d = new Drinker();
		Bottle a = new Bottle();
		d.use(a);
	}

}
