package com.covalense.hibernate.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class ProductsBean  implements Serializable{
	@Id
	@Column(name = "")
	private int productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "price")
	private double price;
	@Column(name = "color")
	private String color;
	@Column(name = "weight")
	private double weight;
}
