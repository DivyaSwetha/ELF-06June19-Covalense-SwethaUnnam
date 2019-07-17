package com.covalense.javaapp.carsandbrand;

import lombok.Data;

@Data
public class CarsBean {
	private String car;
	private String brand;
	
	public CarsBean(String car, String brand) {
		this.car = car;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "CarsBean [car=" + car + ", brand=" + brand + "]";
	}
	
	
	
}
