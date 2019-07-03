package com.covalense.collectionsassignments;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class MobileTest {

	public static void main(String[] args) {

		ComparingWithMobPrice c = new ComparingWithMobPrice();
		TreeSet<Mobile> t = new TreeSet<Mobile>(c);

		Mobile m1 = new Mobile();
		m1.setName("Samsung");
		m1.setPrice(20000);
		m1.setModel("Galaxy A6+");

		Mobile m2 = new Mobile();
		m2.setName("Oppo");
		m2.setPrice(25000);
		m2.setModel("F7+ pro");

		Mobile m3 = new Mobile();
		m3.setName("RedMe");
		m3.setPrice(6000);
		m3.setModel("F5");

		t.add(m1);
		t.add(m2);
		t.add(m3);

		Iterator<Mobile> itr = t.iterator();
		while (itr.hasNext()) {
			Mobile me = itr.next();
			log.info("name is: " + me.getName());
			log.info("Price is: " + me.getPrice());
			log.info("Model is: " + me.getModel());
		}

	}

}
