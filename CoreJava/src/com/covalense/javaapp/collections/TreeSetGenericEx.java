package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetGenericEx {

	public static void main(String[] args) {
		TreeSet<String> h = new TreeSet<String>();

		h.add("Hi");
		h.add("How");
		h.add("Are");
		h.add("you");

		System.out.println("**********for-each**********");
		for (String r : h) {
			System.out.println(r);
		}
		System.out.println("**********Iterator**********");

		Iterator<String> it = h.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);

		}

	}

}
