package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(1);
		li.add(1.2);
		li.add('a');
		li.add("Hanuma");

		System.out.println("***********for-loop*********");
		for (int i = 0; i < li.size(); i++) {
			Object s = li.get(i);				//li is a non-generic linkedList,so get() returns Object type value
			System.out.println(s);
		}

		System.out.println("***********for-each***********");
		for (Object a : li) {
			System.out.println(a);
		}
		System.out.println("*********using reference**********");
		System.out.println(li);
		System.out.println("*********iterator**********");

		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			Object s = itr.next();
			System.out.println(s);
		}

		System.out.println("*********List-iterator***********");
		System.out.println("----------->forward");

		ListIterator litr = li.listIterator();
		while (litr.hasNext()) {
			Object s = litr.next();
			System.out.println(s);
		}
		System.out.println("<----------backward");

		while (litr.hasPrevious()) { // checks if object is present in previous index
			Object r = litr.previous(); // returns object
			System.out.println(r);
		}

	}

}
