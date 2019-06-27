package com.covalense.javaapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestSort {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		Stream<Integer> s = al.stream().sorted();
		List<Integer> b = s.collect(Collectors.toList());
		log.info("elements are: " + b);
		
		List<Integer> c = al.stream().sorted().collect(Collectors.toList());
		log.info("elements are singleline code: " + c);
		
	}

}
