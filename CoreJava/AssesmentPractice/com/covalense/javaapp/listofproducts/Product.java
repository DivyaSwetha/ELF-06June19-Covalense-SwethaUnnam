package com.covalense.javaapp.listofproducts;

public class Product {
	private String name;
	private double cost;
	private String brand;
	private String type;


	

	public Product(String name, double cost, String brand, String type) {
		super();
		this.name = name;
		this.cost = cost;
		this.brand = brand;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", brand=" + brand + ", type=" + type + "]";
	}

	

}
