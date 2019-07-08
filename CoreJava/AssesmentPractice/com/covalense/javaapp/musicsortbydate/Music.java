package com.covalense.javaapp.musicsortbydate;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Music {
	private String music;
	private LocalDateTime date;
}
