package com.covalense.javaapp.collections;

import java.util.ArrayList;

public class ArrayListExsix {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		
		System.out.println("Before----->"+al);
		ArrayList<Double> bl=new ArrayList<Double>();
		bl.add(154.67);
		bl.add(786.87);
		al.addAll(bl);

		
		
		System.out.println("After----->"+al);

	}

}
