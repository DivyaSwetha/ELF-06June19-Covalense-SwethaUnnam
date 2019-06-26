package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("Seetha");
		al.add("Lakshman");
		al.add("Hanuma");

		System.out.println("***********for-loop*********");
		for (int i = 0; i < al.size(); i++) {
			String s = al.get(i);
			System.out.println(s);
		}

		System.out.println("***********for-each***********");
		for (String a : al) {
			System.out.println(a);
		}
System.out.println("*********using reference**********");
		System.out.println(al);
		System.out.println("*********iterator**********");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

		System.out.println("*********List-iterator***********");
		System.out.println("----------->forward");

		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			String s = litr.next();
			System.out.println(s);
		}
		System.out.println("<----------backward");

		while (litr.hasPrevious()) { // checks if object is present in previous index
			String r = litr.previous(); // returns object
			System.out.println(r);
		}

	}

}
