package com.covalense.javaapp.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(1.4);
		v.add('a');
		v.add("Ram");
		System.out.println("****For-loop******");
		for (int i = 0; i < v.size(); i++) {
			Object r = v.get(i);
			System.out.println(r);
		}

		System.out.println("****For Each-loop******");
		for (Object a : v) {
			System.out.println(a);
		}

		System.out.println("****reference******");
		System.out.println(v);

		System.out.println("*****Iterator******");
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			Object s = itr.next();
			System.out.println(s);
		}
		System.out.println("*****List-Iterator******");

		System.out.println("----------->forward");

		ListIterator litr = v.listIterator();
		while (litr.hasNext()) {
			Object s = litr.next();
			System.out.println(s);
		}
		System.out.println("<----------backward");

		while (litr.hasPrevious()) { // checks if object is present in previous index
			Object r = litr.previous(); // returns object
			System.out.println(r);
		}

		System.out.println("**********Enumeration*****");
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object r = e.nextElement();
			System.out.println(r);
		}
	}

}
