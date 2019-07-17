package com.covalense.hibernate.hibernateassessment.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.hibernateassessment.dto.StudentBean;
import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StudentDetails {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(StudentBean.class);
		Projection pro1=Projections.property("firstName");
		Projection pro2=Projections.property("totalMarks");
		
		ProjectionList list=Projections.projectionList();
		list.add(pro1);
		list.add(pro2);
		List<StudentBean> stuList=criteria.setProjection(list).list();
		
		
		
		  for(Object beans:stuList) {
		  log.info("Details: "+beans.toString());
		  }


	}

}
