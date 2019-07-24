package com.cg.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Product {
	@NotNull
private Integer productId;
	@NotEmpty(message="Name cannot be empty!")
private String name;
	@Size(min=3,max=100,message="Must have atleast 3 characters and max 100 characters")
private String description;
	@NotNull
private Double price;
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(Integer productId, String name, String description, Double price) {
	super();
	this.productId = productId;
	this.name = name;
	this.description = description;
	this.price = price;
}
}
