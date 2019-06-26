package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListListIterator {
@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Divya");
		al.add("Ram");

		ListIterator lit = al.listIterator(); // using List-iterator
		
		System.out.println("---------->forward");
		while (lit.hasNext()) { // checks if object is present in next index
			Object r = lit.next(); // returns object
			System.out.println(r);
		}
		System.out.println("<----------backward");

		while (lit.hasPrevious()) { // checks if object is present in previous index
			Object r = lit.previous(); // returns object
			System.out.println(r);
		}

	}
}
