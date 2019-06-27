package com.covalense.javaapp.streams;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestGroupOfValues {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(9, 16, 5, 6, 4, 1, 2);
		s.forEach(i -> log.info("" + i));
	}

}
