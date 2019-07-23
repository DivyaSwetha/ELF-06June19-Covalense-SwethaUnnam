package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailsUsingProjection {

	public static void main(String[] args) {
		//SessionFactory factory = HibernateUtil.getSessionFactory();
				Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro1 = Projections.property("name");
		Projection pro2 = Projections.property("id");
		Projection pro3 = Projections.property("salary");

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(pro1);
		projectionList.add(pro2);
		projectionList.add(pro3);

		criteria.setProjection(projectionList);
		List<Object[]> empBeans = criteria.list();
		for (Object[] objects : empBeans) {
			log.info("Name  "+objects[0]);
			log.info("Id "+objects[1]);
			log.info("Salary  "+objects[2]);

			
		}
		
	}
	

}
