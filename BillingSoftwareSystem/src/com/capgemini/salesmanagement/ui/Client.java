package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.exception.ProductException;
import com.capgemini.salesmanagement.service.IProductService;
import com.capgemini.salesmanagement.service.ProductService;

public class Client {
	
	static Scanner sc=new Scanner(System.in);
	static ProductService productService=new ProductService();
	static IProductService iProductService=new ProductService();
	static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) {
		
		ProductBean productBean=null;
		int productId=0;
		int option=0;
		while(true)
		{
			System.out.println();
			System.out.println();
			System.out.println("Billing Software System ");
			System.out.println("------------------------\n");
			System.out.println("1.View Product details by entering ProductId");
			System.out.println("2.Book Product");
			System.out.println("3.Exit");
			System.out.println("-----------------------");
			System.out.println("select an option");
			
			try {
				
				option=sc.nextInt();
				switch(option)
				{
				
				case 1:
					
					System.out.println("Enter the product id:");
					productId=sc.nextInt();
					
					try
					{
						productBean=new ProductBean();
						productService=new ProductService();
						productService=new ProductService();
						System.out.println(productService.getProductDetails(productId));
						
					}
					catch(ProductException productException) {
						
						System.err.println("Error:"+productException.getMessage());
						logger.error("exception occured ", productException);
						
					}
					break;
					
				case 2:
					ProductBean p=new ProductBean();
					System.out.println("Select Product code:");
					int code=sc.nextInt();
					System.out.println("Enter Quantity:");
					int quantity=sc.nextInt();
					
					ProductBean bean=new ProductBean();
					bean.setProduct_code(code);
					bean.setQuantity(quantity);
					bean.setSale_date(LocalDate.now());
					bean.setLine_total(quantity*p.getProduct_price());
					System.out.println("Sale Id :"+productService.insertsalesDetails(bean));
					break;
					
				case 3:
					
					
				}
				
				
				
				
			}
			catch(Exception e) {
			 
				e.printStackTrace();
			
			}
			
			
			
		}
    
  }
}