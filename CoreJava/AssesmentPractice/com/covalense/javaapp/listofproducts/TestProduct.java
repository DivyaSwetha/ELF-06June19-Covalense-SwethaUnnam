package com.covalense.javaapp.listofproducts;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class TestProduct {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();

		al.add(new Product("car", 800000.00, "BMW", "Vehicle"));
		al.add(new Product("Mobile", 20000.00, "Samsung", "Accesories"));
		al.add(new Product("Laptop", 80000.00, "Apple", "Accesories"));
		al.add(new Product("Jeans", 8000, "Wrangler", "Clothes"));
		al.add(new Product("Goggles", 7000, "Ranban", "Accesories"));
		
		int choice = 2;
		switch (choice) {
		case 1:
			log.info("Fetching product details by Type");
			al.stream().filter(i -> i.getType() == "Accesories").forEach(i -> log.info("" + i));
			break;
		case 2:
			log.info("Fetching product details by range (whose cost is greater than 25000 and lessthan500000");
			al.stream().filter(i -> (i.getCost() > 25000 && i.getCost() < 500000)).forEach(i -> log.info("" + i));
			break;
		default:
			log.info("Enter valid option");

		}

	}

}
