package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.configuration.HibernateConfig;

public class UpdateItem {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		ItemBean item=session.get(ItemBean.class, 1);
		item.setName("Cycle");
		item.setCost(12000);
		item.setDescription("Scott");
		item.setQuantity(10);
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.update(item);
			tx.commit();
			
		}catch(Exception e) {
			if(tx==null) {
				tx.rollback();
			}
		}
		
		session.close();
		

	}

}
