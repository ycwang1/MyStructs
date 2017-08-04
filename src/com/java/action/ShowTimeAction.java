package com.java.action;

import java.util.Date;

import com.java.bean.Product;

public class ShowTimeAction {
private Product product;

	public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

	public String show(){
		Date date = new Date();
		product = new Product();
		product.setName(date.toString());
		return "show";
	}
}
