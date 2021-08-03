package com.createiq.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DriverManagerDemo {

	private static DriverManagerDataSource dataSource = null;
	static {
		dataSource = new DriverManagerDataSource(); 
		dataSource.setUrl("jdbc:mysql://localhost:3306/productcatalog?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
	}

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			System.out.println(connection);
		} finally {
			connection.close();
		}
	}

}
