package com.covalense.javaapp.collections;

import java.util.ArrayList;

public class ArrayListExfour {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		
		System.out.println("Before----->"+al);
		
		al.add(2,22.34);		//adds object at 2nd index, and object in 2nd index gets shifts to next index

		
		System.out.println("After----->"+al);

	}

}
