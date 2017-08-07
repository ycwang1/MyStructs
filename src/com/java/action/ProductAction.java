package com.java.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.java.bean.Category;
import com.java.bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Product product;
	private List<Product> products;
    private List<Integer> selectedProducts;
    private List<Category> categories =new ArrayList();
    private Date date;
    
    public ProductAction(){
    	System.out.println("struts="+this);
    }
  /*  public void validate(){
    	if(product.getName().length()==0){
    		addFieldError("product.name", "we can not be empty");
    	}
    }*/
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
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
	public String addPage(){
		name="defaultname";
		return "addPage";
	}
	public String list(){
		//struts标签 raido，select 
//		products =new ArrayList();
//		selectedProducts = new ArrayList<>();
//		Product p1=new Product();
//		p1.setId(1);
//		p1.setName("p1");
//		p1.setAge(10);
//		products.add(p1);
//		Product p2=new Product();
//		p2.setId(2);
//		p2.setName("p2");
//		p2.setAge(10);
//		products.add(p2);
//		Product p3=new Product();
//		p3.setId(3);
//		p3.setName("p3");
//		p3.setAge(10);
//		products.add(p3);
//		selectedProducts.add(1);
//		selectedProducts.add(2);
//		selectedProducts.add(3);
//		return "list";
		
		//多重迭代
		Category c1=new Category();
		c1.setId(1);
		c1.setName("c1");
		
		Category c2=new Category();
		c2.setId(2);
		c2.setName("c2");
		categories.add(c1);
		categories.add(c2);
		
		List<Product> products1=new ArrayList();
		Product p1 = new Product();
		p1.setId(1);
		p1.setAge(17);
		p1.setName("p1");
		Product p2 = new Product();
		p2.setId(2);
		p2.setAge(17);
		p2.setName("p2");
		Product p3 = new Product();
		p3.setId(3);
		p3.setAge(17);
		p3.setName("p3");
		products1.add(p1);
		products1.add(p2);
		products1.add(p3);
		
		List<Product> products2=new ArrayList();
		Product p4 = new Product();
		p4.setId(4);
		p4.setAge(17);
		p4.setName("p4");
		Product p5 = new Product();
		p5.setId(5);
		p5.setAge(17);
		p5.setName("p5");
		Product p6 = new Product();
		p6.setId(6);
		p6.setAge(17);
		p6.setName("p6");
		products2.add(p4);
		products2.add(p5);
		products2.add(p6);
		
		c1.setProducts(products1);
		c2.setProducts(products2);
		return "list";

		
	}
}
