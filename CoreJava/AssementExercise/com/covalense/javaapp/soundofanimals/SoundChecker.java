package com.covalense.javaapp.soundofanimals;

public class SoundChecker {
	public void validate(Animal animal) {
		if (animal instanceof Cat) {
			animal.sound();
		} else if (animal instanceof Dog) {
			animal.sound();
		}
	}
}
