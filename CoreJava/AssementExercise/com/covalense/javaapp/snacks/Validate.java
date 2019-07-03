package com.covalense.javaapp.snacks;

public class Validate {
	public Snacks getSnacks(Snacks snack) {
		if(snack instanceof Lays) {
			return new Lays();
		}else if(snack instanceof Kurkure) {
			return new Kurkure();
		}
		return snack;
	}

}
