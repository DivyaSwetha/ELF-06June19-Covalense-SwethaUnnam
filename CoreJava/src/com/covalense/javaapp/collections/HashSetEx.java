package com.covalense.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(1);
		h.add(1.2);
		h.add('a');
		h.add("Hi");

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


