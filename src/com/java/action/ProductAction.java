package com.java.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.java.bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private Product product;
	private List<Product> products;
    private List<Integer> selectedProducts;

	public List<Integer> getSelectedProducts() {
		return selectedProducts;
	}
	public void setSelectedProducts(List<Integer> selectedProducts) {
		this.selectedProducts = selectedProducts;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public String show(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		System.out.println("request:"+request+"\n");
		System.out.println("response:"+response+"\n");
		product = new Product();
		product.setName("iphone7");
		return "show";
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String addProduct(){
		Map m = ActionContext.getContext().getSession();
		m.put("name", product.getName());
		System.out.println("product.name"+product.getName());
		return "show";
	}
	public String list(){
		products =new ArrayList();
		selectedProducts = new ArrayList<>();
		Product p1=new Product();
		p1.setId(1);
		p1.setName("p1");
		p1.setAge(10);
		products.add(p1);
		Product p2=new Product();
		p2.setId(2);
		p2.setName("p2");
		p2.setAge(10);
		products.add(p2);
		Product p3=new Product();
		p3.setId(3);
		p3.setName("p3");
		p3.setAge(10);
		products.add(p3);
		selectedProducts.add(1);
		selectedProducts.add(2);
		selectedProducts.add(3);
		return "list";
	}
}
