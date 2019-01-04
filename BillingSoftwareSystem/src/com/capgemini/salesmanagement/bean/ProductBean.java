package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class ProductBean {
	
     int product_code;
     String product_name;
     String product_category;
     String product_description;
     int product_price;
     int quantity;
     
     private LocalDate sale_date;
 	private int line_total;
 	private int sales_Id;
 	
 	
	
     public LocalDate getSale_date() {
		return sale_date;
	}

	public void setSale_date(LocalDate sale_date) {
		this.sale_date = sale_date;
	}

	public int getLine_total() {
		return line_total;
	}

	public void setLine_total(int line_total) {
		this.line_total = line_total;
	}

	public Integer getSales_Id() {
		return sales_Id;
	}

	public void setSales_Id(Integer sales_Id) {
		this.sales_Id = sales_Id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProduct_code() {
		return product_code;
	}
     
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	public String getProduct_category() {
		return product_category;
	}
	
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	
	public String getProduct_description() {
		return product_description;
	}
	
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	
	public int getProduct_price() {
		return product_price;
	}
	
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	
	@Override
	public String toString() {
		return "ProductBean [product_code=" + product_code + ", product_name=" + product_name + ", product_category="
				+ product_category + ", product_description=" + product_description + ", product_price=" + product_price
				+ "]";
	}
	
	

}
