package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.configuration.HibernateConfig;

public class AddItem {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		ItemBean item=new ItemBean();
		item.setItemId(1);
		item.setName("iphone");
		item.setQuantity(10);
		item.setDescription("Apple Iphone");
		item.setCost(99999);
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(item);
			tx.commit();
			
		}catch(Exception e) {
			if(tx==null) {
				tx.rollback();
			}
		}finally {
			session.close();
		}
		
		
		
	}

}
