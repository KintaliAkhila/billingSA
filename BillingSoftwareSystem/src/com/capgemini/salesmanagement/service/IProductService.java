package com.capgemini.salesmanagement.service;

import java.io.IOException;
import java.sql.SQLException;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.exception.ProductException;

public interface IProductService {
	
	ProductBean getProductDetails(int productCode) throws ProductException, ClassNotFoundException, IOException, SQLException;
	ProductBean insertsalesDetails(ProductBean product) throws ProductException, ClassNotFoundException, IOException, SQLException;

}
