package com.covalense.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.CourseBean;

import lombok.extern.java.Log;
@Log
public class CourseTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("coursecfg.xml");
		CourseBean course=context.getBean(CourseBean.class);
		log.info("Course id: "+course.getCourseId());
		log.info("Course name: "+course.getCourseName());
		log.info("Faculty: "+course.getFaculty());
	}
	

}
