package com.covalense.springassignment.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springassignment.beans.Dell;
import com.covalense.springassignment.beans.Hp;
import com.covalense.springassignment.configurations.LaptopConfig;
import com.covalense.springassignment.interfaces.Laptop;

public class laptopTest {
	ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
	Laptop hp=context.getBean(Hp.class);
	
	
	Laptop dell=context.getBean(Dell.class);
	

}
