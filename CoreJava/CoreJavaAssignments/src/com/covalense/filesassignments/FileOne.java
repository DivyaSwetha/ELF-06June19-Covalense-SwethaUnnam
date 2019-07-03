package com.covalense.filesassignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File1 {

	public static void main(String[] args) {
		try {
			
			FileUtils.writeStringToFile(new File("file1.txt"), "Hi iam file 1, how are you all.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
