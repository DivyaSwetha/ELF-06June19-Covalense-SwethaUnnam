package com.covalense.javaapp.streams;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestArratStream {

	public static void main(String[] args) {

		Integer a[] = { 5, 6, 4, 1, 2 };
		Stream<Integer> s = Stream.of(a);
		s.forEach(i -> log.info("" + i));
	}

}
