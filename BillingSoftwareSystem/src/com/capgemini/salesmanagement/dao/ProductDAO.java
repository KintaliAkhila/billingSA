package com.capgemini.salesmanagement.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.exception.ProductException;
import com.capgemini.salesmanagement.bean.ProductBean;
import com.capgemini.salesmanagement.util.DBConnection;

public class ProductDAO implements IProductDAO{

	@Override
	public ProductBean getProductDetails(int productCode) throws ProductException, ClassNotFoundException, IOException, SQLException {
		
		Connection connection=DBConnection.getConnection();
		Statement st=connection.createStatement();
		int a=productCode;
		ProductBean bean = new ProductBean();
		
            try {
            	
  	         
  	         
  	         
            PreparedStatement preparedStatement=connection.prepareStatement(QueryMapper.SELECT_QUERY_WITH_ID);
			preparedStatement.setInt(1, productCode);
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next())
			{
				bean.setProduct_code(rs.getInt(1));
				bean.setProduct_name(rs.getString(2));
				bean.setProduct_category(rs.getString(3));
				bean.setProduct_description(rs.getString(4));
				bean.setProduct_price(rs.getInt(5));
				//bean.setQuantity(rs.getString(6));
			

				
			}
		          
		        
		  }
               catch(Exception e) 
               {
	                  
            	   System.out.println(e);
                }
			return bean;
	}


	@Override
	public ProductBean insertsalesDetails(ProductBean product) throws ProductException, ClassNotFoundException, IOException, SQLException {
		
		
		Connection connection=DBConnection.getConnection();
		try {
		PreparedStatement preparedStatement=connection.prepareStatement(QueryMapper.INSERT_QUERY);
		Statement statement=connection.createStatement();
		preparedStatement.setInt(1, product.getProduct_code());
		preparedStatement.setInt(2, product.getQuantity());
		Date d1= Date.valueOf(product.getSale_date());
		preparedStatement.setDate(3, d1);
		preparedStatement.setDouble(4, product.getLine_total());
			
		
	preparedStatement.executeUpdate();
	
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		return product;
		
		
		
		
	}

}
