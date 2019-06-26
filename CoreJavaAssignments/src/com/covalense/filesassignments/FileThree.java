package com.covalense.filesassignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File3 {

	public static void main(String[] args) {
		try {

			FileUtils.writeStringToFile(new File("file3.txt"), "Hi iam file 3, how are you all.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
