package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.configuration.HibernateConfig;

import lombok.extern.java.Log;
@Log
public class GetItem {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		ItemBean item=session.get(ItemBean.class, 1);
		
		log.info("Item name: "+item.getName());
		log.info("Cost: "+item.getCost());
		log.info("Description: "+item.getDescription());
		log.info("Quantity: "+item.getQuantity());
		
		session.close();
		
		
		
		
	}

}
