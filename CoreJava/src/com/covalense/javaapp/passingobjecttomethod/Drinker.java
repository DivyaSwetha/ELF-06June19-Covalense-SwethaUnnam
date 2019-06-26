package com.covalense.javaapp.passingobjecttomethod;

public class Drinker {
	void use(Bottle b) {
		b.open();
		b.drink();
	}
}
