package com.covalense.hibernate.hibernateassessment.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.hibernateassessment.dto.ProductsBean;
import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ListOfProductsWithPrice {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(ProductsBean.class);
		Criterion cr = Restrictions.lt("price", 100);
		criteria.add(cr);
		List<ProductsBean> productList = criteria.list();
		for (ProductsBean beans : productList) {
			log.info("Product Details whose price is lesstha 100 are: " + beans.toString());
		}

	}

}
