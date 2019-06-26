package com.covalense.javaapp.collections;

import java.util.ArrayList;

public class ArrayListGenForEach {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.1);
		al.add(9.2);
		al.add(1.2);
		al.add(5.6);
		al.add(2.2);

		for (Double r : al) { // using for-each loop

			System.out.println(r);
		}
	}

}
