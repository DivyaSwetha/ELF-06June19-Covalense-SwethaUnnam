package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Divya");
		al.add("Ram");

		Iterator it = al.iterator();		//using iterator

		while (it.hasNext()) {				//checks if object is present in next index
			Object r = it.next();			//returns object
			System.out.println(r);
		}
	}

}
