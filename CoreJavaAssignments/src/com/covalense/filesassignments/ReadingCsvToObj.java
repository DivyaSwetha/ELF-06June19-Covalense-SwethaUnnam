package com.covalense.javaapp.filesassignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.java.Log;

@Log
public class ReadingCsvToObj {

	public static final String delimiter = ",";

	public static void main(String[] args) {
		String[] tempArr = null;
		BufferedReader br = null;
		List<Employee> empList = null;

		// csv file to read
		try {
			File file = new File("firstCsv.csv");
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			empList = new ArrayList<Employee>();

			String line = "";
			String one = br.readLine(); // read to skip the header

			while ((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);

				if (tempArr.length > 0) {
					// Save the employee details in Employee object
					Employee emp = new Employee(tempArr[0].replace("\"", ""),
							Integer.parseInt(tempArr[1].replace("\"", "")),
							Double.parseDouble(tempArr[2].replace("\"", "")));
					empList.add(emp);
				}
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		// Lets print the Employee List
		for (Employee e : empList) {
			log.info(" name is: " + e.getEmployeeName() + " Id is: " + e.getId() + " Salary: " + e.getSalary());
		}
	}

}
