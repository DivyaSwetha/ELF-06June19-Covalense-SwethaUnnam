package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorWithIndex {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Divya");
		al.add("Ram");

		ListIterator lit = al.listIterator(al.size()); // using List-iterator with specifying index size, here pointing to last index using size()

		System.out.println("<----------backward");

		while (lit.hasPrevious()) { // checks if object is present in previous index
			Object r = lit.previous(); // returns object
			System.out.println(r);
		}
	}

}
