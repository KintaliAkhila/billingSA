package com.capgemini.salesmanagement.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.salesmanagement.dao.ProductDAO;
import com.capgemini.salesmanagement.util.DBConnection;

class DBConnectionTest {
	
	static ProductDAO dao;
	static Connection con;
	
	@BeforeClass
	public void initialize() {
		
		dao=new ProductDAO();
		con=null;
		
	}
	
	@Before
	public void beforeEachTest() {
		
		System.out.println("----Starting DBConnection Test Case----\\n");
	}
	

	@Test
	public void test() throws ClassNotFoundException, IOException, SQLException {
		Connection dbCon = DBConnection.getConnection();
		Assert.assertNotNull(dbCon);
	}
	
	@After
	public void afterEachTest() {
		
		System.out.println("----End of DBConnection Test Case----\\n");
	}
	
	@AfterClass
	public void destroy() {
		
		System.out.println("\\t----End of Tests----");
		dao=null;
		con=null;
	}

}
