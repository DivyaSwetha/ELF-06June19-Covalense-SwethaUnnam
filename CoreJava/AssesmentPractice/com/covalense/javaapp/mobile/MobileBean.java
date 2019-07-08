package com.covalense.javaapp.mobile;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MobileBean {
	private String name;
	private String brand;
	private double cost;
	private String color;
}
