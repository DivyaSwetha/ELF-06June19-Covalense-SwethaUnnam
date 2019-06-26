package com.covalense.javaapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.java.Log;

@Log
public class TestStream {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		List<Integer> l = al.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		log.info("" + l);
		List<Integer> l2 = al.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
		log.info("nums divisible by 3 are" + l2);
	}

}
