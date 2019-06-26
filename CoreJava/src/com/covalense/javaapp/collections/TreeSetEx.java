package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet h = new TreeSet();   //allows same type of objects //output is sorted
		h.add(1.1);
		h.add(1.2);
		h.add(1.5);
		h.add(1.6);

		System.out.println("**********for-each**********");
		for (Object r : h) {
			System.out.println(r);
		}
		System.out.println("**********Iterator**********");

		Iterator it = h.iterator();
		while (it.hasNext()) {
			Object s = it.next();
			System.out.println(s);

		}

	}

}
