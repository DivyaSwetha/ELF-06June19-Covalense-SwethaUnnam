package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExGeneric {
	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("Ram");
		li.add("Seetha");
		li.add("Lakshman");
		li.add("Hanuma");
		
		System.out.println("***********for-loop*********");
		for (int i = 0; i < li.size(); i++) {
			String s = li.get(i);
			System.out.println(s);
		}

		System.out.println("***********for-each***********");
		for (String a : li) {
			System.out.println(a);
		}
System.out.println("*********using reference**********");
		System.out.println(li);
		System.out.println("*********iterator**********");

		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

		System.out.println("*********List-iterator***********");
		System.out.println("----------->forward");

		ListIterator<String> litr = li.listIterator();
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
