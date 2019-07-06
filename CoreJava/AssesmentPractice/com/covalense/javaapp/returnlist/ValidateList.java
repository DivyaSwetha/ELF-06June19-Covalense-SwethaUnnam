package com.covalense.javaapp.returnlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import lombok.extern.java.Log;

@Log
public class ValidateList {
	public List<StudentBean> check(int i) {
		if (i == 1) {
			log.info("I am ArrayList");
			return new ArrayList<StudentBean>();
		} else if (i == 2) {
			log.info("I am LinkedList");
			return new LinkedList<StudentBean>();

		} else if (i == 3) {
			log.info("I am Vector");
			return new Vector<StudentBean>();
		}
		return null;
	}
}
