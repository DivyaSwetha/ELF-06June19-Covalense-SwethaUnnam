package com.covalense.javaapp.typeofobjects;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class TestAnimalCount {

	public static void main(String[] args) {

		Validate v = new Validate();
		
		Animal a1 = new Cow();
		Animal a2 = new Cow();

		Animal a3 = new Dog();
		Animal a4 = new Dog();
		Animal a5 = new Dog();

		Animal a6 = new Lion();
		Animal a7 = new Lion();
		Animal a8 = new Lion();
		Animal a9 = new Lion();

		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		al.add(a6);
		al.add(a7);
		al.add(a8);
		al.add(a9);


		Object[] an = al.toArray();
		v.validate(an);

	}

}
