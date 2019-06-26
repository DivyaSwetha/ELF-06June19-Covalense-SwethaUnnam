package com.covalense.collectionsassignments;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ProductArrayList {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();

		Product p1 = new Product();
		p1.setName("Pen");
		p1.setCost(1500);
		p1.setBrand("Bright");

		Product p2 = new Product();
		p2.setName("Book");
		p2.setCost(1000);
		p2.setBrand("ClassMate");

		Product p3 = new Product();
		p3.setName("Dress");
		p3.setCost(3000);
		p3.setBrand("Trends");

		Product p4 = new Product();
		p4.setName("Bike");
		p4.setCost(200000);
		p4.setBrand("KTM");

		Product p5 = new Product();
		p5.setName("car");
		p5.setCost(800000);
		p5.setBrand("Duster");

		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);

		for (Product p : al) {
			if (p.getCost() < 2000) {
				log.info("Name is: " + p.getName());
				log.info("Cost is: " + p.getCost());
				log.info("Brand is: " + p.getBrand());

			}
		}

	}

}
