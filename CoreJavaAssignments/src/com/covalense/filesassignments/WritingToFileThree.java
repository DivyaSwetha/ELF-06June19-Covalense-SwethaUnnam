package com.covalense.filesassignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WritingToFile3 {

	public static void main(String[] args) {
		try {
			String data1 = FileUtils.readFileToString(new File("file1.txt"));
			String data2 = FileUtils.readFileToString(new File("file2.txt"));
			FileUtils.writeStringToFile(new File("file3.txt"), data1 + " " + data2);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
