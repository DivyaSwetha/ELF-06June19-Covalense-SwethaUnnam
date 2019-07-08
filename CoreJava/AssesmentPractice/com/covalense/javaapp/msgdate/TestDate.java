package com.covalense.javaapp.msgdate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestDate {

	public static void main(String[] args) {
		ArrayList<Message> beans = new ArrayList<Message>();
		beans.add(new Message("Hi", LocalDateTime.of(2019, 03, 31,6, 34))); 
		beans.add(new Message("Hello", LocalDateTime.of(2019, 03, 31,6, 35)));                                                                               

		Comparator<Message> c = (i, j) -> i.getDate().compareTo(j.getDate())*-1;
		
		List<Message> li = beans.stream().sorted(c).collect(Collectors.toList());
		for (Message message : li) {
			log.info("Message is " +message.getMessage());

		}

	}

}
