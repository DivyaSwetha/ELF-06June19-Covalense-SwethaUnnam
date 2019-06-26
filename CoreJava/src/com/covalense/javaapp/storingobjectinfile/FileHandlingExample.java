package com.covalense.javaapp.storingobjectinfile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class FileHandlingExample {

	public static void main(String[] args) {
		try { // easy way of creating file using
				// com.covalense.javaapp.lambdaexpressionsmons.io jar file
			/*
			 * FileUtils.writeStringToFile(new File("MyTextFile.txt"),
			 * "This is my Text file!!!");
			 */
			FileUtils.writeStringToFile(new File("Text2.txt"), "My 2nd text file", Charset.defaultCharset());
			log.info("created the file successfully");

			String fileData = FileUtils.readFileToString(new File("Text2.txt"));
			log.info("File data: " + fileData);
			log.info("Read the file successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
