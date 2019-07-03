package com.covalense.javaapp.filesassignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CsvWrite {

	public static void main(String[] args) {

		// first create file object for file placed at location
		// specified by filepath
		File file = new File("firstCsv.csv");

		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);

			// create a List which contains String array
			List<String[]> data = new ArrayList<String[]>();
			data.add(new String[] { "Name", "id", "salary" });
			data.add(new String[] { "Aman", "10", "62000" });
			data.add(new String[] { "Suraj", "11", "63000" });
			writer.writeAll(data);

			// closing writer connection
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
