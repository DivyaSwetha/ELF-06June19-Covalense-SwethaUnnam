package com.covalense.javaapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestDiv {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		Predicate<Integer> p = i -> i % 3 == 0;
		List<Integer> l = al.stream().filter(p).collect(Collectors.toList());
		log.info("nums divisible by 3 are" + l);
	}

}
