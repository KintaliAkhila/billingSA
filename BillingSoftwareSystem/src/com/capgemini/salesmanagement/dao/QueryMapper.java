package com.capgemini.salesmanagement.dao;

public interface QueryMapper {
	
	String SELECT_QUERY_WITH_ID="select * from product where product_code=?";
	String INSERT_QUERY="insert into sales values(sale_seq.nextval,?,?,?,?)";

}
