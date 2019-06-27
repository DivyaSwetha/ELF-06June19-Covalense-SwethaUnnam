package com.covalense.javaapp.streams;

import java.util.stream.Stream;


public class TestSystemOutPrintln {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(5, 6, 4, 1, 2);
		s.forEach(System.out::println);
	}

}
