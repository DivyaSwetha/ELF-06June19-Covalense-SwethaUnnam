package com.covalense.javaapp.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExGeneric {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Seetha");
		v.add("Lakshman");
		v.add("Hanuma");
		v.add("Ram");
		System.out.println("****For-loop******");
		for (int i = 0; i < v.size(); i++) {
			String r = v.get(i);
			System.out.println(r);
		}

		System.out.println("****For Each-loop******");
		for (String a : v) {
			System.out.println(a);
		}

		System.out.println("****reference******");
		System.out.println(v);

		System.out.println("*****Iterator******");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("*****List-Iterator******");

		System.out.println("----------->forward");

		ListIterator<String> litr = v.listIterator();
		while (litr.hasNext()) {
			String s = litr.next();
			System.out.println(s);
		}
		System.out.println("<----------backward");

		while (litr.hasPrevious()) { // checks if object is present in previous index
			Object r = litr.previous(); // returns object
			System.out.println(r);
		}
		
		System.out.println("**********Enumeration*****");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			Object r = e.nextElement();
			System.out.println(r);
		}
	}

}
