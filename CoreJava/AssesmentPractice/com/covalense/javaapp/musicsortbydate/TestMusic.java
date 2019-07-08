package com.covalense.javaapp.musicsortbydate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestMusic {

	public static void main(String[] args) {
		ArrayList<Music> beans = new ArrayList<>();
		beans.add(new Music("vakratundamahakaya.mp3", LocalDateTime.of(2019, 06, 06, 8, 30)));
		beans.add(new Music("sairam sairam.mp3", LocalDateTime.of(2019, 07, 16, 9, 30)));

		Comparator<Music> c = (i, j) -> i.getDate().compareTo(j.getDate())*-1;
		List<Music> list = beans.stream().sorted(c).collect(Collectors.toList());
		for (Music music : list) {
			log.info("list are: " + music);
		}

	}

}
