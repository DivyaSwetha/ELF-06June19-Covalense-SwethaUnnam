package com.covalense.filesassignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class File2 {

	public static void main(String[] args) {

		try {
			FileUtils.writeStringToFile(new File("file2.txt"), " I am file2 Hi every one");
			log.info("data from file1 is written into file2");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
