package com.covalense.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.Pet;
import com.covalense.springcore.configurations.PetConfig;

public class PetTest {

	public static void main(String[] args) {
		//ApplicationContext context=new AnnotationConfigApplicationContext(PetConfig.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("petConfig.xml");
		Pet pet=(Pet)context.getBean("pet");
		pet.getAnimal().eat();
		pet.getAnimal().makeSound();
	}

}

