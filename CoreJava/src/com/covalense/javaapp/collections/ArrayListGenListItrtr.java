package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListGenListItrtr {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.1);
		al.add(9.2);
		al.add(1.2);
		al.add(5.6);
		al.add(2.2);

		ListIterator<Double> lit = al.listIterator();

		System.out.println("----------->forward");
		while (lit.hasNext()) { // checks if object is present in next index
			Double r = lit.next(); // returns object
			System.out.println(r);
		}

		System.out.println("<----------backward");

		while (lit.hasPrevious()) { // checks if object is present in previous index
			Double r = lit.previous(); // returns object
			System.out.println(r);
		}
	}

}
