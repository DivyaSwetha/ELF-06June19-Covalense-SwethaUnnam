package com.covalense.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MessageBean;
import com.covalense.springcore.configurations.MessageConfig;

import lombok.extern.java.Log;

@Log
public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		MessageBean messageBean1 = context.getBean(MessageBean.class);
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		log.info(messageBean1.getMessage());
		log.info(messageBean2.getMessage());
		
		messageBean2.setMessage("Welcome to Spring!!!");
		log.info(messageBean1.getMessage());
		log.info(messageBean2.getMessage());
		
		((ConfigurableApplicationContext)context).close();

	}

}
