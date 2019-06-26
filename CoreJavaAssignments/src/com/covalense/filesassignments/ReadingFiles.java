package com.covalense.filesassignments;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class ReadFrom1To2 {

	public static void main(String[] args) {
		try {
			String data = FileUtils.readFileToString(new File("file1.txt"));
			FileUtils.writeStringToFile(new File("file2.txt"), data + " I am file2 and i copied data from file1");
			log.info("data from file1 is written into file2");

		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}

}
