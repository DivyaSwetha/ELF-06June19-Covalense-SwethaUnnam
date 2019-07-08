package com.covalense.javaapp.msgdate;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Message {
	private String message;
	private LocalDateTime date;
}
