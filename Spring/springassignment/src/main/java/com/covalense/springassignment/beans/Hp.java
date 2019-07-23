package com.covalense.springassignment.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springassignment.interfaces.Laptop;
import com.covalense.springassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class Hp implements Laptop {
	private String brand;
	private String color;
	private double cost;
	private double weight;
	private int ram;
	private String os;

	@Autowired
	private StorageDevice storageDevice;

	public void display() {
		log.info("display of Hp");
	}

	public void process() {
		log.info("display of Hp");
	}

	public void ShowSpecification() {
		log.info("Brand : " + brand);
		log.info("Color : " + color);
		log.info("Cost : " + cost);
		log.info("Weight : " + weight);
		log.info("RAM : " + ram);
		log.info("OS : " + os);
	}
}
