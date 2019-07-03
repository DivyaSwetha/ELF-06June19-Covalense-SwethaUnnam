package com.covalense.assignmentthird;

import lombok.extern.java.Log;

@Log
public class DBstu {

	void recieve(StuBeanArr s1) {
		log.info("name is: " + s1.getName());
		log.info("rollNo is: " + s1.getRoll());
		log.info("Branch is: " + s1.getBrance());

	}

}
