package com.covalense.javaapp.soundofanimals;

public class TestAnimal {

	public static void main(String[] args) {

		Animal animalCat = new Cat();
		Animal animalDog = new Dog();

		SoundChecker checker = new SoundChecker();
		checker.validate(animalCat);

	}

}
