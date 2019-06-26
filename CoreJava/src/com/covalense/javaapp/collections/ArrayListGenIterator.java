package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenIterator {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.1);
		al.add(9.2);
		al.add(1.2);
		al.add(5.6);
		al.add(2.2);

		Iterator<Double> it = al.iterator();
		while (it.hasNext()) { // checks if object is present in next index
			Double r = it.next(); // returns object
			System.out.println(r);
		}
	}

}
