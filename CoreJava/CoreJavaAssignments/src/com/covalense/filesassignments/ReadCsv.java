package com.covalense.javaapp.filesassignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadCsv {
	public static final String delimiter = ",";


	public static void main(String[] args) {
		// csv file to read
		try {
			File file = new File("firstCsv.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = "";
            br.readLine(); //read to skip the header

			String[] tempArr;
			while ((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);
				for (String tempStr : tempArr) {
					System.out.print(tempStr + " ");
				}
				System.out.println();
			}
			br.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		
		
	}

}
