package com.capgemini.salesmanagement.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.dao.IProductDAO;
import com.capgemini.salesmanagement.dao.ProductDAO;
import com.capgemini.salesmanagement.exception.ProductException;


public class ProductService implements IProductService{
	
	IProductDAO productdao=new ProductDAO();
	
public boolean validateDetails(ProductBean product)throws ProductException {
		
		List<String> list = new ArrayList<>();
		boolean result = false;
		if (!isCodeValid(product.getProduct_code())) {
			list.add("code must be 4 digits");
		}
		if (!isQuantityvalid(product.getQuantity())){
			list.add("quantity should not lesser than or equals to 0");
		}
		
		return false;
	}

	private boolean isQuantityvalid(int quantity) {
		String quantityRegEx = "[1-9]{1,2}";
		Pattern pattern = Pattern.compile(quantityRegEx);
		Matcher matcher = pattern.matcher(String.valueOf(quantity));
		return matcher.matches();
	}

	private boolean isCodeValid(int product_code) {
		String codeRegEx = "[1][0-9]{3}";
		Pattern pattern = Pattern.compile(codeRegEx);
		
		Matcher matcher = pattern.matcher(String.valueOf(product_code));
		return matcher.matches();
		
	}

	@Override
	public ProductBean getProductDetails(int productCode) throws ProductException, ClassNotFoundException, IOException, SQLException {

		ProductBean bean;
		int productid=productCode;
		bean=productdao.getProductDetails(productCode);
		return bean;
		
	}

	@Override
	public ProductBean insertsalesDetails(ProductBean product) throws ProductException, ClassNotFoundException, IOException, SQLException {
		
		 productdao.insertsalesDetails(product);
		return product;
	
	}

}
