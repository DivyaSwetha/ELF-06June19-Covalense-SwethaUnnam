package com.covalense.springassignment.beans;

import com.covalense.springassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class PenDrive implements StorageDevice {
	private int capacity;
	private int writingSpeed;
	private int readingSpeed;

	public void write() {
		log.info("Writing data in to PenDrive");
	}

	public void read() {
		log.info("reading data from  PenDrive");
	}

	public void format() {
		log.info("Formating PenDrive");
	}
}
